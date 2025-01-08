package com.example.demo.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("post")
@AllArgsConstructor
@Getter
@Setter
public class Post {
    @Id
    private Long id;

    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}