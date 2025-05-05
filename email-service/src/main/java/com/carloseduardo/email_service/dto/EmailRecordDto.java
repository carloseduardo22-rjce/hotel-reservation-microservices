package com.carloseduardo.email_service.dto;

import java.util.UUID;

public record EmailRecordDto(UUID userId,
							String emailTo,
							String subject, 
							String text) {

}
