package com.example.scrumptious.model;

public class Project {
    // Do projects need a Unique ID?

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Task[] tasks;
}
