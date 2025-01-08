package com.example.demo.post;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@Repository
public class PostRepository {
    public static long postSeq = 1;
    public static Map<Long, Post> postData = Map.of();
    static {
        for (; postSeq < 10; postSeq++) {
            postData.put(postSeq, RandomPostGenerator.generate(postSeq));
        }
    }

    private Duration randomDuration() {
        return Duration.ofMillis(ThreadLocalRandom.current().nextLong(50, 150));
    }

    public Flux<Post> findAll() {
        return Flux.fromIterable(postData.values())
                .flatMap(post -> Mono.just(post).delayElement(randomDuration()));
    }

    public Mono<Long> save(Post post) {
        return Mono.fromCallable(() -> {
            long id = postSeq++;
            post.setId(id);
            postData.put(id, post);
            return id;
        });
    }
    public Mono<Post> getOne(Long postId) {
        return Mono.just(postData.get(postId));
    }
}
