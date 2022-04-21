package com.springgit.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springgit.entities.Book;
import com.springgit.entities.Customer;
import com.springgit.entities.OrderDetails;
import com.springgit.sevices.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@GetMapping(value="/cgproj/listAllOrders")
	public List<OrderDetails> listAllOrders(){
		return orderService.listAllOrders();
	}
	
	@GetMapping(value="/cgproj/listOrderByCustomer")
	public List<OrderDetails> listOrderByCustomer(@RequestBody Customer cs){
		System.out.println(cs);
		return orderService.listOrderByCustomer(cs);
	}
	
	@GetMapping(value="/cgproj/viewOrderForCustomer")
	public OrderDetails viewOrderForCustomer(@RequestBody OrderDetails od) {
		return orderService.viewOrderForCustomer(od.getOrderId());
	}
	
	@GetMapping(value="/cgproj/viewOrderForAdmin")
	public OrderDetails viewOrderForAdmin(@RequestBody OrderDetails od) {
		return orderService.viewOrderForAdmin(od.getOrderId());
	}
	
	@GetMapping(value="/cgproj/viewOrderByBook")
	public List<OrderDetails> viewOrderByBook(@RequestBody Book book){
		return orderService.viewOrderByBook(book.getBookId());
	}
	
	@PostMapping(value="/cgproj/addOrder")
	public OrderDetails addOrder(@RequestBody OrderDetails od) {
		return orderService.addOrder(od); 
	}
	
	@DeleteMapping(value="/cgproj/canceOrder")
	public OrderDetails canceOrder(@RequestBody OrderDetails od) {
		return orderService.cancelOrder(od);
	}
	
	@PutMapping(value="/cgproj/updateOrder")
	public OrderDetails updateOrder(@RequestBody OrderDetails od) {
		return orderService.updateOrder(od);
	}
	
	
	
}
