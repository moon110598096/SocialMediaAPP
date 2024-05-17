package com.example.socialmediaapp.controller;

import com.example.socialmediaapp.domain.Article;
import com.example.socialmediaapp.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @PostMapping(path = "/article")
    public boolean addPost(@RequestBody Article article) {
        return articleService.addArticle(article);
    }

    @DeleteMapping(path = "/article")
    @ResponseBody
    public boolean deletePost(@RequestBody Article article) {
        return articleService.deleteArticle(article);
    }
}
