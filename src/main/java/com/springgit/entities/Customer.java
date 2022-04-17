package com.springgit.entities;

import java.time.LocalDate;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
	
}
