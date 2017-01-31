package com.aetsmtl.java8Learning.inheritance;


public abstract class Auto {

	private int wheels = 3;
	private int placeOnBoard = 4;
	
	//Because of keyword Abstract, this method have to be re-implement
	public abstract void vidange ();
	
	public void onBoard(){
		
	}
	
	public int getPlaceOnBoard() {
		return placeOnBoard;
	}
	
	public int getWheels() {
		return wheels;
	}
	
}
