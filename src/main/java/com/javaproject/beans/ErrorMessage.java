package com.javaproject.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorMessage {
    private final String STATUS = "error";

    private String message;

	public ErrorMessage(String string) {
		// TODO Auto-generated constructor stub
		this.message = string;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSTATUS() {
		return STATUS;
	}
}
