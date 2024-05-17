package com.example.socialmediaapp.service;

import com.example.socialmediaapp.domain.Article;

import java.util.List;

public interface ArticleService {
    boolean addArticle(Article article);
    boolean updateArticle(Article article);
    boolean deleteArticle(Article article);
    List<Article> findAllArticle();
}
