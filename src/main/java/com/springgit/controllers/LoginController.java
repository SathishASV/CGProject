package com.springgit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveUserDetailsServiceAutoConfiguration;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springgit.entities.User;
import com.springgit.sevices.LoginService;

@RestController
public class LoginController {
	@Autowired
	LoginService loginService;
	

	@PostMapping(value="/cgproj/addUser")
	public User addUser(User u) {
		return loginService.addUser(u);
	}
	
	@DeleteMapping(value="/cgproj/deleteUser")
	public User deleteUser(User u) {
		return loginService.deleteUser(u);
	}
	
	@GetMapping(value="/cgproj/validateUser")
	public User validateUser(User u) {
		return loginService.validateUser(u);
	}
	
}
