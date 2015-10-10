package com.kaicube.snomed.srqs.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class InternalError extends ServiceException {
	public InternalError(String message, Throwable cause) {
		super(message, cause);
	}
}
