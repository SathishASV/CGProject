package com.springgit.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springgit.entities.Customer;
import com.springgit.entities.OrderDetails;
import com.springgit.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	public List<OrderDetails> listAllOrders() {
		orderRepository.findAll().forEach(e->{
			System.out.println(e);
		});
		return orderRepository.findAll();
	}

	public List<OrderDetails> listOrderByCustomer(Customer cs) {
//		System.out.println(cs.getCustomerId());
//		orderRepository.listOrderByCustomer(cs.getCustomerId()).forEach(e->{
//			System.out.println(e);
//		});
		return orderRepository.listOrderByCustomer(cs.getCustomerId());
	}

	public OrderDetails viewOrderForCustomer(Integer orderId) {
		return orderRepository.viewOrderForCustomer(orderId);
	}

	public OrderDetails viewOrderForAdmin(Integer orderId) {
		return orderRepository.viewOrderForAdmin(orderId);
	}

	public List<OrderDetails> viewOrderByBook(int bookId) {
		return orderRepository.viewOrderByBook(bookId);
	}

	public OrderDetails addOrder(OrderDetails od) {
		return orderRepository.save(od);
	}

	public OrderDetails cancelOrder(OrderDetails od) {
		orderRepository.delete(od);
		return od;
	}

	public OrderDetails updateOrder(OrderDetails od) {
		OrderDetails od1=orderRepository.findById(od.getOrderId()).get();
		if(od1!=null) {
			od1.setBook(od.getBook());
			od1.setBookOrder(od.getBookOrder());
			od1.setQuantity(od.getQuantity());
			od1.setSubtotal(od.getSubtotal());
			return orderRepository.save(od1);
		}
		else {
			return null;
		}
	}
	
	
	
}
