package com.carloseduardo.user_service.controller;

import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.carloseduardo.user_service.dto.ReservationDTO;
import com.carloseduardo.user_service.dto.RoomDTO;
import com.carloseduardo.user_service.entitie.User;
import com.carloseduardo.user_service.service.UserService;
import com.carloseduardo.user_service.util.CustomResponse;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@PostMapping(value = "/newUser")
	public ResponseEntity<?> newUser(@RequestBody User user) {
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
	
	@GetMapping(value = "/rooms")
	public ResponseEntity<?> getRooms() {
		try {
			List<RoomDTO> roomDTOs = userService.getRooms();
			return ResponseEntity.ok().body(roomDTOs);
		} catch (Exception e) {
			Date currentDate = new Date();
			CustomResponse<User> errorResponse = new CustomResponse<>(false, 400, "Error when created new Author!", currentDate);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
		}
	}
	
	@PostMapping(value = "/reservation")
	public String newReservation (@RequestBody ReservationDTO reservationDTO) {
		return userService.newReservation(reservationDTO);
	}
	
}
