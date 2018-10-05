package com.Consume.Consume;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown= true)
public class Value {
	
	private int id;
	private String quote;
	public Value(int id, String quote) {
		super();
		this.id = id;
		this.quote = quote;
	}
	public Value() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	

}
