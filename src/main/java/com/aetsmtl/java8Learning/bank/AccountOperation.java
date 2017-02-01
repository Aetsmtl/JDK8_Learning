package com.aetsmtl.java8Learning.bank;

public interface AccountOperation {
	
	public double getBalance() ;
	
	public void deposit(double amount);
	
	public String getDescription();
	
	public boolean withdraw(double amount);
}
