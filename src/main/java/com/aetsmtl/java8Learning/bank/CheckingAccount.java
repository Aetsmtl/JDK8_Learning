package com.aetsmtl.java8Learning.bank;

public class CheckingAccount extends Account implements AccountOperation {

	private final double overdraftLimit;
	
	public CheckingAccount(double balance, double overdraftLimit) {
		// TODO Auto-generated constructor stub
		super (balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	public CheckingAccount(double balance) {
		this(balance,0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Checking account";
	}

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if (amount < balance + overdraftLimit)
		{
			balance -= amount;
			return true;
		}
		{
			return false;
			
		}
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		balance += amount;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getDescription() + " balance is " + balance;
	}

}
