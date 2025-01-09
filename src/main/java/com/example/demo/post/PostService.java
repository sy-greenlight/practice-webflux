package com.example.demo.post;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Flux<Post> getManyPost() {
        return null; // TODO
    }

    public Mono<PostMeta> getOnePostMetadata() {
        return null; // TODO
    }
}
