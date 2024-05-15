package com.example.socialmediaapp.repository;

import com.example.socialmediaapp.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {

}
