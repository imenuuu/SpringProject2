package com.example.springproject1.web.dto;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.example.springproject1.domain.posts.Posts;
import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public class PostsListResponseDto {


    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;
    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }
}
