package com.aetsmtl.java8Learning.soccerLeague;

public class Player {
	
	protected String name;
	
	
	public Player() {
		// TODO Auto-generated constructor stub
		this.name = "No name";
	}
	
	public boolean setName(String name) {
		
		if (name.startsWith("A")){
			this.name = name;
			return true;
		}
		else{
			return false;
		}
	}
	
	public String getName() {
		return name;
	}
	

}
