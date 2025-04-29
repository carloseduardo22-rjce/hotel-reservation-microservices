package com.carloseduardo.room_service.entitie;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity
@Table(name = "room")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String number;
	private BigDecimal pricePerNight;
	private String type;
	
	public Room() {
	}

	public Room(Integer id, String number, BigDecimal pricePerNight, String type) {
		super();
		this.id = id;
		this.number = number;
		this.pricePerNight = pricePerNight;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public BigDecimal getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(BigDecimal pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
