package com.carloseduardo.user_service.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.carloseduardo.user_service.entities.User;
import com.carloseduardo.user_service.service.UserService;
import com.carloseduardo.user_service.util.CustomResponse;

@RestController
@RequestMapping(value = "/User")
public class UserController {

	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping(value = "/NewUser")
	public ResponseEntity<CustomResponse<User>> newUser(@RequestBody User user) {
		try {
			userService.newUser(user);
			Date currentDate = new Date();
			CustomResponse<User> response = new CustomResponse<>(true, 200, "New User save sucessfuly!", currentDate);
			return ResponseEntity.ok(response);
		} catch (Exception e) {
			Date currentDate = new Date();
			CustomResponse<User> errorResponse = new CustomResponse<>(false, 400, "Error when created new Author!", currentDate);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
		}
	}
	
}
