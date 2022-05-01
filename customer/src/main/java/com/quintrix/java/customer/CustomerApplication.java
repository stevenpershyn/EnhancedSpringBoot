package com.quintrix.java.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.quintrix.java.customer.documents.Customer;
import com.quintrix.java.customer.repository.CustomerRepository;

@SpringBootApplication
public class CustomerApplication implements CommandLineRunner{

	@Autowired
	CustomerRepository customerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Customer> custList = customerRepository.findAll();
		
		System.out.println(custList);
	}

}
