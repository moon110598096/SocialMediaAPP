package com.example.socialmediaapp.repository;

import com.example.socialmediaapp.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

    @Procedure(name = "addUser")
    void addUser(@Param("pUserID") String userID, @Param("pUserName")String userName,
                        @Param("pEmail") String email, @Param("pPassword") String password,
                        @Param("pBiography") String biography);

    @Query(value = "CALL findUserById(:p_userId)", nativeQuery = true)
    User findUserById(String p_userId);
}
