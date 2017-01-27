package com.aetsmtl.java8Learning.inheritance;

public class Vehicule {

	protected String color;
	protected String typeEngine;
	protected String owner;
	
	public Vehicule(String color, String typeEngine, String owner) {
		super();
		this.color = color;
		this.typeEngine = typeEngine;
		this.owner = owner;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This car have ... "+ color.toUpperCase() +" color \nand ... " + typeEngine.toUpperCase() +" engine power\n"
				+ "their owner is ... " + owner.toUpperCase();
	}
	
	public void accelerate (){
		System.out.println("From Vehicule class,I'm accelerating... 100Km/h");
	}
	
}
