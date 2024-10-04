package com.example.scrumptious.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")  // Specify the MongoDB collection (optional)
public class User {

    @Id
    private String id;  // The OAuth sudo, without the Google OAuth prefix
    
    private String name;
    
    private String[] tasks;

    // Default constructor for MongoDB (required)
    public User() {
    }

    // Constructor
    public User(String id, String name, String[] tasks) {
        this.id = id;
        this.name = name;
        this.tasks = tasks;
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getTasks() {
        return tasks;
    }

    public void setTasks(String[] tasks) {
        this.tasks = tasks;
    }
}
