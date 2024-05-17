package com.example.socialmediaapp.repository;

import com.example.socialmediaapp.domain.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CrudRepository<Article, String> {
}
