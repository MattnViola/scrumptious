package com.example.scrumptious.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.scrumptious.model.Project;

public interface ProjectRepository extends MongoRepository<Project, String> {
}
