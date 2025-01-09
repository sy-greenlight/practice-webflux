package com.example.demo.post;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
public class PostMeta {
    private int titleTextSize;
    private int contentTextSize;
    private LocalDateTime lastUpdatedTime;
}
