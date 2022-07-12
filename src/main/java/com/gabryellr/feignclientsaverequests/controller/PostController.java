package com.gabryellr.feignclientsaverequests.controller;

import com.gabryellr.feignclientsaverequests.model.Post;
import com.gabryellr.feignclientsaverequests.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/requests")
public class PostController {
    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    @PostMapping("/success")
    public ResponseEntity<Post> successCall(@RequestBody Post post) {
        Post postCreated = this.service.successCall();

        return ResponseEntity.ok(postCreated);
    }

    @PostMapping("/bad-request")
    public ResponseEntity<Post> badRequestCall(@RequestBody Post post) {
        Post postCreated = this.service.badRequest();

        return ResponseEntity.ok(postCreated);
    }
}
