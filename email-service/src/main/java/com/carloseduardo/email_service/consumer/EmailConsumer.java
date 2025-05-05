package com.carloseduardo.email_service.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.carloseduardo.email_service.dto.EmailRecordDto;

@Component
public class EmailConsumer {

	@RabbitListener(queues = "${broker.queue.email.name}")
	public void listenEmailQueue(@Payload EmailRecordDto emailRecordDto) {
		System.out.print(emailRecordDto.emailTo());
	}
	
}
