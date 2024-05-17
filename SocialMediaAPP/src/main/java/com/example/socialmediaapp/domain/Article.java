package com.example.socialmediaapp.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Post")
public class Article {
    @Id
    @Column(name = "PostID")
    private String articleID;
    @Column(name = "UserID")
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getArticleID() {
        return articleID;
    }

    public void setArticleID(String articleID) {
        this.articleID = articleID;
    }
}