package com.example.socialmediaapp.repository;

import com.example.socialmediaapp.domain.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {
    @Procedure("addComment")
    void addComment(String p_commentID, String p_userID, String p_postID, String p_content);

    @Query(value = "CALL findCommentById(:p_commentID)", nativeQuery = true)
    Comment findCommentById(String p_commentID);
}
