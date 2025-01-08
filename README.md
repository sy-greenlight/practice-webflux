### 워밍업 과제

Spring Webflux에 익숙해지기 위해 게시글 API를 작성해보는 과제입니다.

**사전 설정**

- 언어: Java JDK 17
- IDE: 자유
- 참고자료: [Guide to Spring WebFlux | Baeldung](https://www.baeldung.com/spring-webflux)

**제약 사항**

- 외부 컴포넌트 (DB, Redis) 등은 사용하지 않습니다
- 서버는 1대라고 가정합니다
- 설정 파일은 수정하지 않습니다
- PostControlle와 PostService 이외에 별도의 개발은 필요하지 않습니다

### 문제 `PostController`의 TODO를 작성하세요

1. `/post`는 전체 게시글을 조회합니다.
    - Reactive하게 작성해보세요. (Blocking되는 부분이 없어야 합니다.)
   

2. `/post/{postId}/meta`는 게시글의 메타데이터를 반환하는 API입니다.
    - Reactive하게 작성해보세요.
    - 메타데이터에는 제목의 길이, 내용의 길이, 마지막 수정일자가 포함됩니다.