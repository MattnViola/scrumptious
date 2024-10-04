package com.example.scrumptious.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.UUID;

@Document(collection = "projects")  // Specifies the MongoDB collection
public class Project {

    @Id
    private String id;  // Unique ID for each project

    private String name;

    private Task[] tasks;

    // Default constructor required by MongoDB
    public Project() {
        this.id = UUID.randomUUID().toString();  // Generate UUID as string for the project ID
    }

    // Constructor to initialize fields
    public Project(String name, Task[] tasks) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.tasks = tasks;
    }

    // Getters and setters

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

    public Task[] getTasks() {
        return tasks;
    }

    public void setTasks(Task[] tasks) {
        this.tasks = tasks;
    }
}
