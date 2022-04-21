package com.springgit.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {

	@Id
	int customerId;
	String email;
	String mobileNumber;
	String fullName;
	String password;
	@OneToOne
	@JoinColumn(referencedColumnName = "addressId",name="address_id")
	Address address;
	LocalDate registerOn;
	public Customer() {
		super();
	}
	public Customer(int customerId, String email, String mobileNumber, String fullName, String password,
			Address address, LocalDate registerOn) {
		super();
		this.customerId = customerId;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.fullName = fullName;
		this.password = password;
		this.address = address;
		this.registerOn = registerOn;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public LocalDate getRegisterOn() {
		return registerOn;
	}
	public void setRegisterOn(LocalDate registerOn) {
		this.registerOn = registerOn;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", email=" + email + ", mobileNumber=" + mobileNumber
				+ ", fullName=" + fullName + ", password=" + password + ", address=" + address + ", registerOn="
				+ registerOn + "]";
	}
	
	
	
}
