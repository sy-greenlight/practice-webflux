package com.example.demo.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class Post {
    private Long id;

    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}