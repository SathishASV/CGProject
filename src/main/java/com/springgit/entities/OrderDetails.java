package com.springgit.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="OrderDetails")
public class OrderDetails implements Serializable{

	@Id
	@OneToOne
	@JoinColumn(referencedColumnName = "bookId",name="book_id")
	Book book;
	@OneToOne
	@JoinColumn(referencedColumnName = "orderId",name="order_id")
	BookOrder bookOrder;
	int quantity;
	double subtotal;
	public OrderDetails() {
		super();
	}
	public OrderDetails(Book book, BookOrder bookOrder, int quantity, double subtotal) {
		super();
		this.book = book;
		this.bookOrder = bookOrder;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public BookOrder getBookOrder() {
		return bookOrder;
	}
	public void setBookOrder(BookOrder bookOrder) {
		this.bookOrder = bookOrder;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	@Override
	public String toString() {
		return "OrderDetails [bookOrder=" + bookOrder + ", quantity=" + quantity + ", subtotal=" + subtotal + "]";
	}
	
}