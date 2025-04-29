package com.carloseduardo.user_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.carloseduardo.user_service.client.ReservationClient;
import com.carloseduardo.user_service.client.RoomClient;
import com.carloseduardo.user_service.entitie.User;
import com.carloseduardo.user_service.dto.ReservationDTO;
import com.carloseduardo.user_service.dto.RoomDTO;
import com.carloseduardo.user_service.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;
	private final RoomClient roomClient;
	private final ReservationClient reservationClient;
	
	public UserService(UserRepository userRepository, RoomClient roomClient, ReservationClient reservationClient) {
		this.userRepository = userRepository;
		this.roomClient = roomClient;
		this.reservationClient = reservationClient;
	}
	
	public User newUser(User user) {
		return userRepository.save(user);
	}
	
	public List<RoomDTO> getRooms() {
		return roomClient.getRooms();
	}
	
	public String newReservation(ReservationDTO reservationDTO) {
		return reservationClient.newReservation(reservationDTO);
	}
	
}
