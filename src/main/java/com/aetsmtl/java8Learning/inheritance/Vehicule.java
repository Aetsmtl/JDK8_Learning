package com.aetsmtl.java8Learning.inheritance;

public class Vehicule {

	String color;
	String typeEngine;
	String owner;
	
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
	
}
