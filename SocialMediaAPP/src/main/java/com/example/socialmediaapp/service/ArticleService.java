package com.example.socialmediaapp.service;

import com.example.socialmediaapp.domain.Article;

public interface ArticleService {
    boolean addArticle(Article article);
    boolean updateArticle(Article article);
    boolean deleteArticle(String id);
    Article findAllArticle();
}
