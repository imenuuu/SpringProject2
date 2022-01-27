package com.example.springproject1.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
//롬복의 어노테이션, 클래스 내의 Getter 메소드를 자동 생성
@NoArgsConstructor
//롬복의 어노테이션 , 파라미터가 없는 기본 생성자를 생성
@Entity
//JAP의 어노테이션, 테이블과 링크될 클래스임을 나타낸다.
//Posts 클래스는 실제 DB의 테이블과 매칭될 클래스이다. 보통 Entity 클래스라고 한다.
public class Posts {
    @Id
    //해당 테이블의 PK필드를 나타낸다.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //PK 생성 규칙을 나타낸다.
    private Long Id;

    @Column(length = 500,nullable = false)
    //테이블의 칼럼을 나타낸다. 굳이 선언하지 않더라도 해당 클래스의 필드느 모두 칼럼이 된다.
    //사용하는 이유는, 기본값 외에 추가로 변경이 필요한 옵션이 있으면 사용
    //문자열의 사이즈를 늘리고싶거나(ex:title) 타입을 TEXT로 변경하고 싶거나(ex:content) 등의 사용된다.
    private String title;

    @Column(columnDefinition = "Text",nullable = false)
    private String content;

    private String author;
    @Builder
    // 해당 클래스의 빌더 패턴 클래스를 생성
    // 생성자 상단에 선언 시 생성자에 포함된 필드만 빌더에 포함
    public Posts(String title, String content, String author){
        this.title=title;
        this.content=content;
        this.author=author;
    }

    public void update(String title,String content){
        this.title=title;
        this.content=content;
    }
}
