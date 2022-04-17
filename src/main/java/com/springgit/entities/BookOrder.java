package com.springgit.entities;

import java.time.LocalDate;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class BookOrder {

	@Id
	int OrderId;
	@OneToOne
	@JoinColumn(referencedColumnName = "customerId")
	Customer customer;
	LocalDate orderDate;
	double orderTotal;
	String status;
	@OneToOne
	@JoinColumn(referencedColumnName = "addressId")
	Address shippingAddress;
	String paymentMethod;
	String recepientName;
	String recepientPhone;
	public BookOrder() {
		super();
	}
	public BookOrder(int orderId, Customer customer, LocalDate orderDate, double orderTotal, String status,
			Address shippingAddress, String paymentMethod, String recepientName, String recepientPhone) {
		super();
		OrderId = orderId;
		this.customer = customer;
		this.orderDate = orderDate;
		this.orderTotal = orderTotal;
		this.status = status;
		this.shippingAddress = shippingAddress;
		this.paymentMethod = paymentMethod;
		this.recepientName = recepientName;
		this.recepientPhone = recepientPhone;
	}
	public int getOrderId() {
		return OrderId;
	}
	public void setOrderId(int orderId) {
		OrderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(double orderTotal) {
		this.orderTotal = orderTotal;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getRecepientName() {
		return recepientName;
	}
	public void setRecepientName(String recepientName) {
		this.recepientName = recepientName;
	}
	public String getRecepientPhone() {
		return recepientPhone;
	}
	public void setRecepientPhone(String recepientPhone) {
		this.recepientPhone = recepientPhone;
	}
	@Override
	public String toString() {
		return "BookOrder [OrderId=" + OrderId + ", customer=" + customer + ", orderDate=" + orderDate + ", orderTotal="
				+ orderTotal + ", status=" + status + ", shippingAddress=" + shippingAddress + ", paymentMethod="
				+ paymentMethod + ", recepientName=" + recepientName + ", recepientPhone=" + recepientPhone + "]";
	}
	
}
