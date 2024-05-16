package com.example.socialmediaapp.service;

import com.example.socialmediaapp.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {
    @Autowired
    private UserRepository repository;

    @Test
    public void test() {
        UserService userSerivce = new UserService(repository);
        String phoneNumber = "0908625017";
        String userName = "111";
        String email = "liu@gmail.com";
        String password = "abcd1234";
        String biography = "test biography";

        userSerivce.addNewUser(phoneNumber, userName, email, password, biography);
    }
}