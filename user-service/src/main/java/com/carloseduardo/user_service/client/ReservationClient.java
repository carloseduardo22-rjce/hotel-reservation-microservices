package com.carloseduardo.user_service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.carloseduardo.user_service.dto.ReservationDTO;

@FeignClient(name = "reservation-service")
public interface ReservationClient {

	@PostMapping("/reservation/newReservation")
	public String newReservation(ReservationDTO reservationDTO);
	
}
