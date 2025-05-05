package com.carloseduardo.reservation_service.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.carloseduardo.reservation_service.dto.EmailDto;

@Component
public class ReservationProducer {

	private final RabbitTemplate rabbitTemplate;

	public ReservationProducer(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}
	
	@Value("${broker.queue.email.name}")
	private String routingKey;
	
	public void publishMessage(String emailUser) {
		EmailDto emailDto = new EmailDto();
		emailDto.setEmailTo(emailUser);
		emailDto.setSubject("Reserva feita com sucesso!");
		emailDto.setText("Obrigado pela reserva em nosso em hotel, divirta-se e aproveite o melhor que temos a oferecer!");
		
		rabbitTemplate.convertAndSend("", routingKey, emailDto);
	}
	
}
