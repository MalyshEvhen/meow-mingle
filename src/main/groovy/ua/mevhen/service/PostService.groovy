package ua.mevhen.service

import ua.mevhen.domain.model.Post
import ua.mevhen.dto.PostRequest
import ua.mevhen.dto.PostResponse

interface PostService {

    Post findById(String id)

    PostResponse save(String username, PostRequest request)

    PostResponse update(String id, PostRequest request, String userId)

    PostResponse update(Post post)

    void delete(String id, String username)

    void addLike(String username, String postId)

    void removeLike(String username, String postId)
}