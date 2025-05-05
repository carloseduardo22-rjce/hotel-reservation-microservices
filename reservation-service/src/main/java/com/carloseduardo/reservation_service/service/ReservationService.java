package com.carloseduardo.reservation_service.service;

import org.springframework.stereotype.Service;

import com.carloseduardo.reservation_service.entitie.Reservation;
import com.carloseduardo.reservation_service.producer.ReservationProducer;
import com.carloseduardo.reservation_service.repository.ReservationRepository;

import jakarta.transaction.Transactional;

@Service
public class ReservationService {

	private final ReservationRepository reservationRepository;
	private final ReservationProducer reservationProducer;

	public ReservationService(ReservationRepository reservationRepository, ReservationProducer reservationProducer) {
		this.reservationRepository = reservationRepository;
		this.reservationProducer = reservationProducer;
	}
	
	@Transactional
	public String newReservation(Reservation reservation) {
		reservationRepository.save(reservation);
		reservationProducer.publishMessage(reservation.getEmailUser());
		return "Reservation saved sucessfuly!";
	}
	
	
}
