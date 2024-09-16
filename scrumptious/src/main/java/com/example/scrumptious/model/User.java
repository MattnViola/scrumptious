package com.example.scrumptious.model;

public class User {

    // The id is going to be their OAuth sudo, without the google oauth.
    public final String id;

    public String name;

    public String[] tasks;

    public User(String id, String name, String[] tasks) {
        this.id = id;
        this.name = name;
        this.tasks = tasks;
    }
    
}
