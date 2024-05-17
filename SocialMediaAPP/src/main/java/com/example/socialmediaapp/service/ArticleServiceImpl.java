package com.example.socialmediaapp.service;

import com.example.socialmediaapp.domain.Article;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService{

    @Override
    public boolean addArticle(Article article) {
        return false;
    }

    @Override
    public boolean updateArticle(Article article) {
        return false;
    }

    @Override
    public boolean deleteArticle(String id) {
        return false;
    }

    @Override
    public Article findAllArticle() {
        return null;
    }
}
