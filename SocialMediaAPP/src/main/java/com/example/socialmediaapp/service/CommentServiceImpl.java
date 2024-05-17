package com.example.socialmediaapp.service;

import com.example.socialmediaapp.domain.Comment;
import com.example.socialmediaapp.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public boolean addComment(Comment comment) {
        String commentID = UUID.randomUUID().toString();
        commentRepository.addComment(commentID, comment.getUserId(),
                comment.getArticleID(),comment.getContent());
        return true;
    }

    @Override
    public Comment findCommentById(Comment comment) {
        String commentID = comment.getCommentID();
        return commentRepository.findCommentById(commentID);
    }
}
