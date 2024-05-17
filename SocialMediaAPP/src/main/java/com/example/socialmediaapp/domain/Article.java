package com.example.socialmediaapp.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Post")
public class Article {
    @Id
    @Column(name = "PostId")
    private String articleID;
    @Column(name = "UserId")
    private String authorID;
    @Column(name = "Content")
    private String content;

    public Article(String authorID, String content) {
        this.authorID = authorID;
        this.content = content;
    }

    public Article() {

    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}