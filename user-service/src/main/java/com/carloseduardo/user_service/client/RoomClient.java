package com.carloseduardo.user_service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.carloseduardo.user_service.dto.RoomDTO;

@FeignClient(name = "room-service")
public interface RoomClient {

	@GetMapping("/room/rooms")
	List<RoomDTO> getRooms();
	
}
