package com.example.socialmediaapp.repository;

import com.example.socialmediaapp.domain.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {
    boolean addComment(String commentID, String articleID, String userId, String content);

    Comment findCommentById(String commentID);
}
