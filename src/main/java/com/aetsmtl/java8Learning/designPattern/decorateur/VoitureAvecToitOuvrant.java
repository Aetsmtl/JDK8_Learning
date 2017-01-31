package com.aetsmtl.java8Learning.designPattern.decorateur;

public class VoitureAvecToitOuvrant extends VoitureAvecOption {

	@Override
	public int getPrix() {
		// TODO Auto-generated method stub
		return voiture.getPrix() + 10;
	}
	
	@Override
	public int getPoids() {
		// TODO Auto-generated method stub
		return voiture.getPoids() + 10; 
	}

}
