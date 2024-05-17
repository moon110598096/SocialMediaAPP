package com.example.socialmediaapp.repository;

import com.example.socialmediaapp.domain.Article;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends CrudRepository<Article, String> {
    @Procedure("addPost")
    void addArticle(String p_postId, String p_userId, String p_content);

    @Procedure("editPost")
    void editArticle(String p_postId, String p_content);

    @Procedure("deletePost")
    void deleteArticle(String p_postId);

    @Query(value = "CALL findAllPost", nativeQuery = true)
    List<Article> findAllPost();
}
