package com.example.socialmediaapp.repository;

import com.example.socialmediaapp.domain.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Article, String> {
}
