package com.example.socialmediaapp.service;

import com.example.socialmediaapp.domain.Article;
import com.example.socialmediaapp.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ArticleServiceImpl implements ArticleService{

    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository){
        this.articleRepository  = articleRepository;
    }

    @Override
    public boolean addArticle(Article article) {
        String articleID = UUID.randomUUID().toString();
        articleRepository.addArticle(articleID, article.getAuthorID(), article.getContent());

        return true;
    }

    @Override
    public boolean updateArticle(Article article) {
        articleRepository.editArticle(article.getArticleID(), article.getContent());
        return true;
    }

    @Override
    public boolean deleteArticle(Article article) {
        articleRepository.deleteArticle(article.getArticleID());
        return true;
    }

    @Override
    public List<Article> findAllArticle() {
        return articleRepository.findAllPost();
    }
}
