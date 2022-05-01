package com.quintrix.java.customer.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.quintrix.java.customer.documents.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

    // 
}