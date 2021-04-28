package com.purplewisteria.RestfulWebServices.model;

public class InfoBean {

	 private String  message;
	 
	 public InfoBean(String message) {
			super();
			this.message = message;
		}
		 
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "InfoBean [message=" + message + "]";
	}

}
