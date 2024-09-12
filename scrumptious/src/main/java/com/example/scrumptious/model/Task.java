package com.example.scrumptious.model;

import java.util.UUID;

public class Task {

    private final UUID id = UUID.randomUUID();

    public UUID getId() {
        return id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String userAssigned;

    public String getUserAssigned() {
        return userAssigned;
    }

    public void setUserAssigned(String userAssigned) {
        this.userAssigned = userAssigned;
    }

    private UUID userAssignedID;

    public UUID getUserAssignedID() {
        return userAssignedID;
    }

    public void setUserAssignedID(UUID userAssignedID) {
        this.userAssignedID = userAssignedID;
    }

    public Task() {
    }
}
