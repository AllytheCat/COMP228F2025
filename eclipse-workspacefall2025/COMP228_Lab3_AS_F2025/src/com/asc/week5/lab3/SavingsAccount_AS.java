package com.asc.week5.lab3;

public class SavingsAccount_AS extends BankAccount_AS{
	
	public SavingsAccount_AS(String accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
		
	}
	
	public void withdraw(double amount) {
		if (getBalance() - amount < 50.0 ) {
			throw new IllegalArgumentException("Withdrawal denied. Balance cannot fall below $50");
		}
		
		super.withdraw(amount);
		
	}
	
	public String toString() {
		return String.format("Savings Account%n%s", super.toString());
	}

}
