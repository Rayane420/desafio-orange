package com.desafio.orange.exceptions;

import java.sql.Date;

public class MensagemErro {
	
	private Date currentDate;
	private String message;
	
	public Date getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
