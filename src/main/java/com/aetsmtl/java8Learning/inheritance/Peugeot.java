package com.aetsmtl.java8Learning.inheritance;

public class Peugeot extends Vehicule{

	public Peugeot(String color, String typeEngine, String owner) {
		super(color, typeEngine, owner);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("\nEven I'm a vehicule I cann't go fastly, 60Km/h!");
	}

	@Override
	public void vidange() {
		// TODO Auto-generated method stub
		super.vidange();
	}
	
	@Override
	public void onBoard() {
		// TODO Auto-generated method stub
		super.onBoard();
	}
	
}
