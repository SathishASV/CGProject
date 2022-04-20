package com.springgit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springgit.entities.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Integer> {

}

