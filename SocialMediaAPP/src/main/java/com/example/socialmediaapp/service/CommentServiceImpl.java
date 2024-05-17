package com.example.socialmediaapp.service;

import com.example.socialmediaapp.domain.Article;
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
        return commentRepository.addComment(commentID, comment.getArticleID(),
                comment.getUserId(), comment.getContent());
    }

    @Override
    public Comment findCommentById(Comment comment) {
        String commentID = comment.getCommentID();
        return commentRepository.findCommentById(commentID);
    }
}
