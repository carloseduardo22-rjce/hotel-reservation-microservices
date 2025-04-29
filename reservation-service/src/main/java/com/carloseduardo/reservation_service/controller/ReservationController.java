package com.carloseduardo.reservation_service.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carloseduardo.reservation_service.entitie.Reservation;
import com.carloseduardo.reservation_service.service.ReservationService;

@RestController
@RequestMapping(value = "/reservation")
public class ReservationController {

	private final ReservationService reservationService;	
	
	public ReservationController(ReservationService reservationService) {
		this.reservationService = reservationService;
	}

	@PostMapping(value = "/newReservation")
	public String newReservation(@RequestBody Reservation reservation) {
		String response = reservationService.newReservation(reservation);
		return response;
	}
	
}
