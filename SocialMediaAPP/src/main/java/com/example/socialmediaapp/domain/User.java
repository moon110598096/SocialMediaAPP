package com.example.socialmediaapp.domain;

public class User {
    private String phoneNumber;
    private int userID;
    private String userName;
    private String email;
    private String password;
    private String biography;

    public User(String phoneNumber, int userID, String userName, String email, String password, String biography) {
        this.phoneNumber = phoneNumber;
        this.userID = userID;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.biography = biography;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getUserID() {
        return userID;
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


