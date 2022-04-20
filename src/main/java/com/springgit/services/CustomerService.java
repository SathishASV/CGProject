package com.springgit.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.springgit.entities.Customer;
import com.springgit.repositories.CustomerRepository;

public class CustomerService {

	@Autowired(required=true)
	CustomerRepository repository;
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Customer addCustomer(Customer c) {
		// TODO Auto-generated method stub
		return repository.save(c);
	}

	public Customer updateCustomer(int customerId, Customer c) {
		// TODO Auto-generated method stub
		Customer s1=repository.findById(customerId).get();
		if( s1!= null)
		{
			s1.setEmail(c.getEmail());
			s1.setMobileNumber(c.getMobileNumber());
			s1.setFullName(c.getFullName());
			s1.setPassword(c.getPassword());
			s1.setAddress(c.getAddress());
			//s1.setFullName(s.getFullName());
			
			return repository.save(s1);
		}
		else {
			return s1;
		}
		
	}

	public String deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		Customer s1=repository.findById(customerId).get();
		if( s1== null)
		{
			return "no record";
			
		}
		else {
			repository.delete(s1);
			return "record delete successfully";
		}
	}
}
