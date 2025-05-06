package com.carloseduardo.email_service.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.carloseduardo.email_service.dto.EmailRecordDto;

@Service
public class EmailService {

	private final JavaMailSender emailSender;

	public EmailService(JavaMailSender emailSender) {
		this.emailSender = emailSender;
	}
	
	@Value("${spring.mail.username}")
	private String fromEmail;
	
	public void sendEmail(EmailRecordDto emailRecordDto) {
		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom(fromEmail);
			message.setTo(emailRecordDto.emailTo());
			message.setSubject(emailRecordDto.subject());
			message.setText(emailRecordDto.text());
			emailSender.send(message);
			
		} catch (MailException e) {
			System.out.print(e.getMessage());
		}
	}
	
}
