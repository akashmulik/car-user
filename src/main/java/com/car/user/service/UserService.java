package com.car.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.user.entity.User;
import com.car.user.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository ur;
	
	public User save(User u) {
		return ur.save(u);
	}
	
	public User User(int id) {
		return ur.getOne(id);
	}
}
