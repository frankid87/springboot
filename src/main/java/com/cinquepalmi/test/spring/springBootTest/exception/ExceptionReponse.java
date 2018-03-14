package com.cinquepalmi.test.spring.springBootTest.exception;

import java.time.LocalDateTime;

public class ExceptionReponse {
	
	private LocalDateTime timestamp;
	private String message;
	private String detail;
	
	public ExceptionReponse(LocalDateTime timestamp, String message, String detail) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.detail = detail;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetail() {
		return detail;
	}
	
}
