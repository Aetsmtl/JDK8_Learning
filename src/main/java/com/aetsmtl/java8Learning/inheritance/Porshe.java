package com.aetsmtl.java8Learning.inheritance;

public class Porshe extends Vehicule {

	protected String nameConstructor;
	
	public Porshe(String nameConstructor, String color, String typeEngine, String owner) {
		super(color, typeEngine, owner);
		this.nameConstructor = nameConstructor;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  nameConstructor.toUpperCase() + " is the constructor\n" + super.toString();
	}
	
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		super.accelerate();
		System.out.println("Because I'm a Porse, I can go faster than this 200Km/h... Yeah!");
	}
}
