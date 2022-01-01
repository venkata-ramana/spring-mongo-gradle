package com.demo.springdockermongo.repository;

import com.demo.springdockermongo.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}
