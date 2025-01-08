package com.example.demo.post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/* TODO
    게시글 API를 작성해보는 과제입니다.
    1. 전체 게시글을 반환하는 API를 Reactive하게 작성해보세요. (Blocking되는 부분이 없어야 합니다.)
    2. 게시글의 메타데이터를 반환하는 API를 Reactive하게 작성해보세요. 메타데이터에는 제목의 길이, 내용의 길이, 마지막 수정일자가 포함됩니다.
    - PostControlle와 PostService 이외에 별도의 개발은 필요하지 않습니다.
 */

@RestController
@RequestMapping("post")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("")
    public Flux<Post> getManyPost() {
        return null; // TODO 1
    }

    @GetMapping("/{postId}/meta")
    public Mono<PostMeta> getOnePostMetadata() {
        return null; // TODO 2
    }
}
