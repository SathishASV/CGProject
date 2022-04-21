package com.springgit.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springgit.entities.Customer;
import com.springgit.entities.OrderDetails;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetails,Integer>{

//	@Query(value="select u.order_id,u.quantity,u.subtotal,u.book_id,u.bookorder_id from OrderDetails u",nativeQuery=true)
//	public List<OrderDetails> listAllOrders();
	
	@Query(value="select * from order_details where order_details.bookorder_id=(select order_id from book_order where book_order.customer_id=:cust_id)",nativeQuery=true)
	public List<OrderDetails> listOrderByCustomer(@Param(value = "cust_id") Integer cs);

	@Query(value="select * from order_details where order_details.order_id=:id",nativeQuery=true)
	public OrderDetails viewOrderForCustomer(@Param(value = "id") Integer orderId);

	@Query(value="select * from order_details od where od.order_id=:id",nativeQuery=true)
	public OrderDetails viewOrderForAdmin(@Param(value = "id") Integer orderId);

	@Query(value="select * from order_details where order_details.book_id=:bookid",nativeQuery=true)
	public List<OrderDetails> viewOrderByBook(@Param(value = "bookid") int bookId);
}
