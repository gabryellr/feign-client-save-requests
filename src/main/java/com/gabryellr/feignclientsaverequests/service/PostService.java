package com.gabryellr.feignclientsaverequests.service;

import com.gabryellr.feignclientsaverequests.feign.PostClient;
import com.gabryellr.feignclientsaverequests.model.Post;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    private PostClient postClient;

    public PostService(PostClient postClient) {
        this.postClient = postClient;
    }

    public Post successCall() {
        Post post = new Post(123L, "title", "body");

        return postClient.successCall(post);
    }

    public Post badRequest() {
        Post post = new Post(123L, "title", "body");

        return postClient.badRequest(post);
    }

}