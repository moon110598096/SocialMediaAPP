package com.example.socialmediaapp.service;

import com.example.socialmediaapp.domain.Comment;

public interface CommentService {
    boolean addComment(Comment comment);
    Comment findCommentById(Comment comment);
}
