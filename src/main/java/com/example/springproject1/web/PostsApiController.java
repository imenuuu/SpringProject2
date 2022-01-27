package com.example.springproject1.web;

import com.example.springproject1.service.PostsService;
import com.example.springproject1.web.dto.PostsResponseDto;
import com.example.springproject1.web.dto.PostsSaveRequestDto;
import com.example.springproject1.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
//final이 선언된 모든 필드를 인자값으로 하는 생성자를 생성
@RestController
public class PostsApiController {
    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    private Long update(@PathVariable Long id , @RequestBody PostsUpdateRequestDto requestDto) {
        return postsService.update(id, requestDto);
    }
    @GetMapping("/api/v1/posts/{id}")
    private PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }

}
