package com.example.socialmediaapp.service;

import com.example.socialmediaapp.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void addNewUserTest() {
        UserServiceImpl userSerivce = new UserServiceImpl(userRepository);
        String phoneNumber = "1234567890";
        String userName = "111";
        String email = "liu@gmail.com";
        String password = "abcd1234";
        String biography = "test biography";

        // first add new user
//        assertTrue(userSerivce.addUser(phoneNumber, userName, email, password, biography));

        // When adding a duplicate user, it should return false
//        assertFalse(userSerivce.addUser(phoneNumber, userName, email, password, biography));
    }
}