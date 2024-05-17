package com.example.socialmediaapp.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Comment")
public class Comment {
    @Id
    @Column(name = "commentID")
    private String commentID;
    @Column(name = "articleID")
    private String articleID;
    @Column(name = "userId")
    private String userID;
    @Column(name = "content")
    private String content;

    public Comment(){

    }

    public Comment(String content, String userId, String articleID, String commentID) {
        this.content = content;
        this.userID = userId;
        this.articleID = articleID;
        this.commentID = commentID;
    }

    public String getCommentID() {
        return commentID;
    }

    public String getArticleID() {
        return articleID;
    }

    public String getUserId() {
        return userID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentID='" + commentID + '\'' +
                ", articleID='" + articleID + '\'' +
                ", userID='" + userID + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
