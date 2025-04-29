package com.carloseduardo.reservation_service.service;

import org.springframework.stereotype.Service;

import com.carloseduardo.reservation_service.entitie.Reservation;
import com.carloseduardo.reservation_service.repository.ReservationRepository;

@Service
public class ReservationService {

	private final ReservationRepository reservationRepository;

	public ReservationService(ReservationRepository reservationRepository) {
		this.reservationRepository = reservationRepository;
	}
	
	public String newReservation(Reservation reservation) {
		reservationRepository.save(reservation);
		return "Reservation saved sucessfuly!";
	}
	
	
}
