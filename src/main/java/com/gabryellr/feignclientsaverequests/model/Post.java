package com.gabryellr.feignclientsaverequests.model;

public class Post {
    private Long postId;
    private String title;
    private String body;

    public Post(Long postId, String title, String body) {
        this.postId = postId;
        this.title = title;
        this.body = body;
    }

    public Post() {
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Post{" +
                "userId='" + postId + '\'' +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
