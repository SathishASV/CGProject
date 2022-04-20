package com.springgit.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springgit.entities.Customer;
import com.springgit.services.CustomerService;


public class CustomerController {
	CustomerService service;
	
	@GetMapping("/Customers/all")
	public List<Customer> getAllCustomers(){
		return service.getAllCustomers();		
	}
	@PostMapping("/Customers/add")
	public Customer addCustomer(@RequestBody Customer c) {
		return service.addCustomer(c);
	}
	@PutMapping("/Customers/update/{customerId}")
	public Customer updateCustomer(@PathVariable int customerId ,@RequestBody Customer c) {
		return service.updateCustomer(customerId,c);
	}
	@DeleteMapping(value="/delete/{id}")
	public String deleteCustomer(@PathVariable int customerId) {
		return service.deleteCustomer(customerId);
	}

}
