package com.aetsmtl.java8Learning.designPattern.decorateur;

public class Ds extends Voiture{

	public Ds() {
		// TODO Auto-generated constructor stub
		this.marque = "DS";
		this.nom = "Citroen";
	}
	@Override
	public int getPrix() {
		// TODO Auto-generated method stub
		return 15000; 
	}

	@Override
	public int getPoids() {
		// TODO Auto-generated method stub
		return 350;
	}
	

}
