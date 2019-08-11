package com.pavan.dto;

import java.io.Serializable;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private HttpStatus status;
	private String message;
	private Object data;

	public ApiResponse(HttpStatus status, String message, Object data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}

}
