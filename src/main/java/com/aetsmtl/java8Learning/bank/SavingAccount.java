package com.aetsmtl.java8Learning.bank;

public class SavingAccount extends Account implements AccountOperation{

	Double rateOfInterest  = 0.06;
	
	public SavingAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getDescription() + " balance is " + balance;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return " Saving account ";
	}

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if (amount < balance)
			{
				balance -= amount;
				return true;
			}				{
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
		balance *=rateOfInterest;
	}

}
