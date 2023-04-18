package com.perera.digimath;

public class User {
    private String name;
    private String email;

    public User() {
        // Default constructor required for Firebase Realtime Database
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // ... getter and setter methods ...
}

