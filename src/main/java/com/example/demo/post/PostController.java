package com.example.demo.post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping()
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/post")
    public Flux<Post> getManyPost() {
        return null; // TODO 1
    }

    @GetMapping("/post/{postId}/meta")
    public Mono<PostMeta> getOnePostMetadata() {
        return null; // TODO 2
    }
}
