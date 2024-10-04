package com.example.scrumptious.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.scrumptious.model.Task;

public interface TaskRepository extends MongoRepository<Task, String> {
}