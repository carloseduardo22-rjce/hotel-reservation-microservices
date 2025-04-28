package com.carloseduardo.user_service.service;

import org.springframework.stereotype.Service;

import com.carloseduardo.user_service.entities.User;
import com.carloseduardo.user_service.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User newUser (User user) {
		return userRepository.save(user);
	}
	
}
