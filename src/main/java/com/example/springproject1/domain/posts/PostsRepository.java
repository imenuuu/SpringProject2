package com.example.springproject1.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
//Posts 클래스 생성이 끝났다면, Posts 클래스로 Database 를 접근하게
public interface PostsRepository extends JpaRepository<Posts,Long> {
}
