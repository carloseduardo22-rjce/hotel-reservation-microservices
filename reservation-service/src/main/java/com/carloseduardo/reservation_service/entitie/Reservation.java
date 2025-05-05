package com.carloseduardo.reservation_service.entitie;

import java.util.UUID;

import jakarta.persistence.*;

@Entity
@Table(name = "reservation")
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	
	private String emailUser;
	private String numberRoom;
	private boolean payment;
	private String typeRoom;
	
	public Reservation() {
	}

	public Reservation(UUID id, String emailUser, String numberRoom, boolean payment, String typeRoom) {
		this.id = id;
		this.emailUser = emailUser;
		this.numberRoom = numberRoom;
		this.payment = payment;
		this.typeRoom = typeRoom;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public String getNumberRoom() {
		return numberRoom;
	}

	public void setNumberRoom(String numberRoom) {
		this.numberRoom = numberRoom;
	}

	public boolean isPayment() {
		return payment;
	}

	public void setPayment(boolean payment) {
		this.payment = payment;
	}

	public String getTypeRoom() {
		return typeRoom;
	}

	public void setTypeRoom(String typeRoom) {
		this.typeRoom = typeRoom;
	}
	
}
