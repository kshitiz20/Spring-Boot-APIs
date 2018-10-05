package com.CorsTest.Corstest.hello;

public class helloresouce {
	
	public int id;
	public String message;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	public helloresouce(int id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
	
	public helloresouce() {
		
	}
	

}
