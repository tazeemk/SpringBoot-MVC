package com.nt.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.client.MongoDatabase;
import com.nt.document.Employee1;

public interface IEmployeeRepo extends MongoRepository<Employee1, String> {

}
