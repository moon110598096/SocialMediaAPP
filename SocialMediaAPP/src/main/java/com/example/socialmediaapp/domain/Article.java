package com.example.socialmediaapp.domain;

import java.util.List;

public class Article {
    private int authorID;
    private String content;
    private List<String> comments;

    public Article(int authorID, String content, List<String> comments) {
        this.authorID = authorID;
        this.content = content;
        this.comments = comments;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public void addComment(String comment) {
        comments.add(comment);
    }
}