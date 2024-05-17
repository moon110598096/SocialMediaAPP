package com.example.socialmediaapp.service;

import com.example.socialmediaapp.domain.User;
import com.example.socialmediaapp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean addUser(User user) {
        if (userRepository.findById(user.getUserId()).isPresent())
            return false;

        userRepository.addUser(user.getUserId(), user.getUserName(), user.getEmail(),
                user.getPassword(), user.getBiography());

        return true;
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
    public User findUserById(String userId) {
        return userRepository.findUserById(userId);
    }

    @Override
    public boolean checkUser(String id, String passWord) {
        User user = findUserById(id);
        String userPassword = user.getPassword();

        return Objects.equals(userPassword,passWord);
    }
}
