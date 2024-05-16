package com.example.socialmediaapp.service;

import com.example.socialmediaapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addNewUser(String phoneNumber, String userName, String email, String password, String biography) {
        if (userRepository.findById(phoneNumber).isPresent()) {
            System.out.println("User with this phone number already exists!");
            return;
        }

        userRepository.addUser(phoneNumber, userName, email, password, biography);

        System.out.println("User registered successfully!");
    }
}
