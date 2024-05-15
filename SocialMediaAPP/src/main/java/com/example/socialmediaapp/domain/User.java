package com.example.socialmediaapp.domain;

public class User {
    private String userId;
    private String userName;
    private String email;
    private String password;
    private String biography;

    public User(String phoneNumber, String userName, String email, String password, String biography) {
        this.userId = phoneNumber;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.biography = biography;
    }

    public User() {

    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getBiography() {
        return biography;
    }
}


