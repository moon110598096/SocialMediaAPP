package com.example.socialmediaapp.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "User")
public class User {
    @Id
    @Column(name = "UserID")
    private String userId;
    @Column(name = "UserName")
    private String userName;
    @Column(name = "Email")
    private String email;
    @Column(name = "Password")
    private String password;
    @Column(name = "Biography")
    private String biography;

    public User() {

    }

    public User(String phoneNumber, String userName, String email, String password, String biography) {
        this.userId = phoneNumber;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.biography = biography;
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


