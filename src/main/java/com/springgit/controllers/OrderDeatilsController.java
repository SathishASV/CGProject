package com.springgit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springgit.entities.OrderDetails;
import com.springgit.services.OrderServiceImpl;

@RestController
public class OrderDeatilsController {

	@Autowired
	OrderServiceImpl orderServiceImpl;
	
	@GetMapping
	public List<OrderDetails> listAllOrders(){
		return OrderServiceImpl.listAllOrders();
	}
	
}
