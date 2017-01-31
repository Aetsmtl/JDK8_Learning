package com.aetsmtl.java8Learning.designPattern.decorateur;

/* Un décorateur permet d'attacher dynamiquement 
 * de nouvelles responsabilités à un objet. 
 * Les décorateurs offrent une alternative assez 
 * souple à l'héritage pour composer de nouvelles
 * fonctionnalités.*/

public abstract class Voiture {

	String marque, nom;
	
	public abstract int getPrix();
	public abstract int getPoids();
}
