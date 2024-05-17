package com.example.socialmediaapp.controller;

import com.example.socialmediaapp.domain.Article;
import com.example.socialmediaapp.domain.Comment;
import com.example.socialmediaapp.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping(path = "/comment")
    public boolean addComment(@RequestBody Comment comment) {
        return commentService.addComment(comment);
    }

    @GetMapping(path = "/comment")
    public Comment findCommentById(@RequestBody Comment comment) {
        return commentService.findCommentById(comment);
    }
}
