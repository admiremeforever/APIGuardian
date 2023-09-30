package com.APIGuardian.APIGuardian.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.APIGuardian.APIGuardian.model.User;

@Service
public class UserService {
	private List<User> store = new ArrayList<>();

	public UserService() {
		store.add(new User(UUID.randomUUID().toString(), "Manish Kumar", "manish@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "vaibhav", "Vaibhav@gmail.com"));
		
	}
    
	public List<User> getUsers() {

		return this.store;
	}

}
