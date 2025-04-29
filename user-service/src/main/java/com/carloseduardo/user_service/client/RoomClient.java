package com.carloseduardo.user_service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.carloseduardo.user_service.dto.ReservationDTO;
import com.carloseduardo.user_service.dto.RoomDTO;

@FeignClient(name = "room-service")
public interface RoomClient {

	@GetMapping("/room/rooms")
	List<RoomDTO> getRooms();
	
	@PostMapping("/room/newReservation")
	String newReservation(ReservationDTO reservationDTO);
	
}
