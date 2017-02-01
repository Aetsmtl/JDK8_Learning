package com.aetsmtl.java8Learning.bank;

public abstract class Account {
	
	protected double balance;
	
	public Account(double balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
	}
	
	/*public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount){
		balance += amount;
	}
	
	public abstract String getDescription();
	
	public abstract boolean withdraw(double amount);*/
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "the current balance is : " + balance;
	}
}
