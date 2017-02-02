package com.aetsmtl.java8Learning.stream;

public class Person {
	
	private String nom;
	private String surname;
	private String address;
	private int age;
	
	public Person(String nom, String surname, String address, int age) {
		super();
		this.nom = nom;
		this.surname = surname;
		this.address = address;
		this.age = age;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nom +" Surnom : " + surname + " Adresse : " + address + "\n";
	}
}
