package com.example.socialmediaapp.controller;

import com.example.socialmediaapp.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.socialmediaapp.service.UserService;

@RestController
@RequestMapping(path="/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/user")
    public boolean addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
}
