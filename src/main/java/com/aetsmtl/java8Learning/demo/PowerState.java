package com.aetsmtl.java8Learning.demo;

public enum PowerState {
	OFF("The power is ON"),
	ON("The power is OFF"),
	SUSPEND("The power is Suspend");
	
	private String s ;
	private PowerState(String description) {
		// TODO Auto-generated constructor stub
		s = description;
	}
	
	private String getDescription(){
		return s;
	}
}
