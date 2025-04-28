package com.carloseduardo.user_service.dto;

import java.math.BigDecimal;

public class RoomDTO {

	private Integer id;
	private String number;
	private String type;
	private BigDecimal pricePerNight;

	public RoomDTO(Integer id, String number, String type, BigDecimal pricePerNight) {
		super();
		this.id = id;
		this.number = number;
		this.type = type;
		this.pricePerNight = pricePerNight;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public BigDecimal getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(BigDecimal pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	
}
