package com.carloseduardo.user_service.dto;

public class ReservationDTO {

	private String emailUser;
	private String numberRoom;
	private String typeRoom;
	private boolean payment;
	
	public ReservationDTO() {
		
	}

	public ReservationDTO(String emailUser, String numberRoom, String typeRoom, boolean payment) {
		super();
		this.emailUser = emailUser;
		this.numberRoom = numberRoom;
		this.typeRoom = typeRoom;
		this.payment = payment;
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

	public String getTypeRoom() {
		return typeRoom;
	}

	public void setTypeRoom(String typeRoom) {
		this.typeRoom = typeRoom;
	}

	public boolean isPayment() {
		return payment;
	}

	public void setPayment(boolean payment) {
		this.payment = payment;
	}
	
}
