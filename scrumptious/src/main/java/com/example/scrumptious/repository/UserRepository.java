package com.example.scrumptious.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.scrumptious.model.User;

public interface UserRepository extends MongoRepository<User, String> {
}
