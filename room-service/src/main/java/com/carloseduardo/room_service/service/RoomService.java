package com.carloseduardo.room_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.carloseduardo.room_service.entitie.Room;
import com.carloseduardo.room_service.repository.RoomRepository;

@Service
public class RoomService {

	private final RoomRepository roomRepository;

	public RoomService(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}
	
	public List<Room> getRooms() {
		return roomRepository.findAll();
	}
	
}
