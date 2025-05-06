package com.carloseduardo.email_service.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.carloseduardo.email_service.dto.EmailRecordDto;
import com.carloseduardo.email_service.service.EmailService;

@Component
public class EmailConsumer {
	
	private final EmailService emailService;

	public EmailConsumer(EmailService emailService) {
		this.emailService = emailService;
	}

	@RabbitListener(queues = "${broker.queue.email.name}")
	public void listenEmailQueue(@Payload EmailRecordDto emailRecordDto) {
		emailService.sendEmail(emailRecordDto);
	}
	
}
