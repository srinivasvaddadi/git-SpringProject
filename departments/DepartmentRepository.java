package com.example.demo.departments;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {

}
