package com.springgit.sevices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springgit.entities.User;
import com.springgit.repositories.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;

	public User addUser(User u) {
		return loginRepository.save(u);
	}

	public User deleteUser(User u) {
		User u1=loginRepository.findById(u.getUserId()).get();
		if(u1.getUserName().equals(u.getUserName()) && u1.getPassword().
				equals(u.getPassword()) && u1.getRole().equals(u.getRole())) {
			loginRepository.delete(u1);
			return u;
		}
		return null;
	}

	public User validateUser(User u) {
		return null;
	}
	
}
