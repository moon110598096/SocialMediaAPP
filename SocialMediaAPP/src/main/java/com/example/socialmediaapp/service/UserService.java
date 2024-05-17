package com.example.socialmediaapp.service;

import com.example.socialmediaapp.domain.User;

public interface UserService {
    boolean addUser(String phoneNumber, String userName, String email, String password, String biography);

    boolean addUser(User user);
    boolean updateUser(User user);
    boolean deleteUser(String id);
    User findUserById(String id);
}
