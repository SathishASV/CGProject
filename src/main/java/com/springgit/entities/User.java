package com.springgit.entities;

public class User {

	int userId;
	String email;
	String password;
	String role;
	public User() {
		super();
	}
	public User(int userId, String email, String password, String role) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", password=" + password + ", role=" + role + "]";
	}
	
	
	
}
