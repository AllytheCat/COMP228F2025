package com.asc.week5.lab3;

// SavingsAccount_AS class extends BankAccount_AS and restricts withdrawals

public class SavingsAccount_AS extends BankAccount_AS{
	
	// constructor passes parameters to superclass 
	public SavingsAccount_AS(String accountNumber, double initialBalance) {
		super(accountNumber, initialBalance);
		
	}
	
	// override withdraw method to enforce minimum balance rule 
	@Override
	public void withdraw(double amount) {
		if (getBalance() - amount < 50.0 ) {
			throw new IllegalArgumentException("Withdrawal denied. Balance cannot fall below $50");
		}
		
		super.withdraw(amount);
		
	}
	
	// return string representation of SavingsAccount_AS object 
	@Override
	public String toString() {
		return String.format("Savings Account%n%s", super.toString());
	}

}
