package com.springgit.entities;

public class Address {

	int addressId;
	String address;
	String city;
	String country;
	String pincode;
	public Address() {
		super();
	}
	public Address(int addressId, String address, String city, String country, String pincode) {
		super();
		this.addressId = addressId;
		this.address = address;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", address=" + address + ", city=" + city + ", country=" + country
				+ ", pincode=" + pincode + "]";
	}
	
	
}
