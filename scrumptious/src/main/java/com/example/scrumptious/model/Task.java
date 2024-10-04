package com.example.scrumptious.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.UUID;

@Document(collection = "tasks")  // Specify the MongoDB collection
public class Task {

    @Id
    private String id;  // Store UUID as a string

    private String name;
    private String description;
    private String userAssigned;
    private String userAssignedID;  // Store UUID of assigned user as a string

    // Default constructor required by MongoDB
    public Task() {
        this.id = UUID.randomUUID().toString();  // Generate UUID for the task ID as string
    }

    // Constructor to initialize fields
    public Task(String name, String description, String userAssigned, UUID userAssignedID) {
        this.id = UUID.randomUUID().toString();  // Generate UUID for the task ID
        this.name = name;
        this.description = description;
        this.userAssigned = userAssigned;
        this.userAssignedID = userAssignedID != null ? userAssignedID.toString() : null;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserAssigned() {
        return userAssigned;
    }

    public void setUserAssigned(String userAssigned) {
        this.userAssigned = userAssigned;
    }

    public String getUserAssignedID() {
        return userAssignedID;
    }

    public void setUserAssignedID(UUID userAssignedID) {
        this.userAssignedID = userAssignedID != null ? userAssignedID.toString() : null;
    }
}
