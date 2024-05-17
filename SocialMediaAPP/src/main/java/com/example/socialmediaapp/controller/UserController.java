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
        System.out.println(user.toString());
        return userService.addUser(user);
    }

    @PostMapping(path = "/login")
    public boolean checkUser(@RequestBody User user) {
        System.out.println(user.getUserId());
        System.out.println(user.getPassword());
        return userService.checkUser(user.getUserId(), user.getPassword());
    }
}
