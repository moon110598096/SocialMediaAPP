package com.example.socialmediaapp.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Comment")
public class Comment {
    @Id
    @Column(name = "CommentID")
    private String commentID;
    @Column(name = "PostID")
    private String articleID;
    @Column(name = "UserID")
    private String userID;
    @Column(name = "Content")
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

    public void setUserID(String userID) {
        this.userID = userID;
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
