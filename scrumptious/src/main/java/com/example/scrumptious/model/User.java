package com.example.scrumptious.model;

import java.util.UUID;

public class User {

    public UUID id;

    public String name;

    public String[] tasks;

    public User(UUID id, String name, String[] tasks) {
        this.id = id;
        this.name = name;
        this.tasks = tasks;
    }
    
}
