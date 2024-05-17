package com.example.socialmediaapp.controller;

import com.example.socialmediaapp.domain.Article;
import com.example.socialmediaapp.domain.User;
import com.example.socialmediaapp.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping(path = "/article")
    public boolean addPost(@RequestBody Article article) {
        System.out.println(article.toString());
        return articleService.addArticle(article);
    }
}
