package com.carloseduardo.reservation_service.dto;

public class EmailDto {

	private String emailTo;
	private String subject;
	private String text;
	
	public EmailDto() {
	}

	public EmailDto(String emailTo, String subject, String text) {
		this.emailTo = emailTo;
		this.subject = subject;
		this.text = text;
	}

	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
