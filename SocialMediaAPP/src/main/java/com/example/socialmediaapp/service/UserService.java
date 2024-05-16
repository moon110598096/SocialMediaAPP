package com.example.socialmediaapp.service;

import com.example.socialmediaapp.domain.User;
import com.example.socialmediaapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(String phoneNumber, String userName, String email, String password, String biography) {
        if (userRepository.findById(phoneNumber).isPresent()) {
            System.out.println("User with this phone number already exists!");
            return;
        }

        User newUser = new User(phoneNumber, userName, email, password, biography);

        userRepository.save(newUser);

        System.out.println("User registered successfully!");
    }
}
