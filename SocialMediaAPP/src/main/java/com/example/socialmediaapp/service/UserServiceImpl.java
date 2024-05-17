package com.example.socialmediaapp.service;

import com.example.socialmediaapp.domain.User;
import com.example.socialmediaapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean addUser(String phoneNumber, String userName, String email, String password, String biography) {
        if (userRepository.findById(phoneNumber).isPresent())
            return false;

        userRepository.addUser(phoneNumber, userName, email, password, biography);

        return true;
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(String id) {
        return false;
    }

    @Override
    public User findUserById(String id) {
        return null;
    }
}
