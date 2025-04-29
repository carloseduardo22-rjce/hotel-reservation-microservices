package com.carloseduardo.reservation_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carloseduardo.reservation_service.entitie.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer>{
}
