package com.carloseduardo.room_service.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.carloseduardo.room_service.entitie.Room;
import com.carloseduardo.room_service.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {

	private final RoomService roomService;

	public RoomController(RoomService roomService) {
		this.roomService = roomService;
	}
	
	@GetMapping(value = "/rooms")
	public ResponseEntity<?> getRooms() {
		try {
			List<Room> rooms = roomService.getRooms();
			return ResponseEntity.ok().body(rooms);
		} catch (Exception e) {
			System.out.println("Exception Caught" + e.getMessage());
		}
		return null;
	}
	
}
