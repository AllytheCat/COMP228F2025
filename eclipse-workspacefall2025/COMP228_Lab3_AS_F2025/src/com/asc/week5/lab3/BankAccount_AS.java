package com.asc.week5.lab3;

// BankAccount_AS class defines basic banking operations.

public class BankAccount_AS {
	private final String accountNumber; //unique account ID 
	private double balance; //current account balance
	
	public BankAccount_AS(String accountNumber, double initialBalance) {
	
		//validate account balance
		if (accountNumber == null || accountNumber.isEmpty()) {
		
			throw new IllegalArgumentException("Account number cannot be empty.");
		
	}
		//validate initial balance
		if (initialBalance < 0.0) {
		
			throw new IllegalArgumentException("Initial balance must be >= 0.0");
	}
	
	this.accountNumber = accountNumber;
	this.balance = initialBalance;
	
}
	//deposit amount from account
	public void deposit(double amount) {
		if (amount <= 0.0) {
			throw new IllegalArgumentException("Deposit amount must be > 0.0");
		}
		
		balance += amount;
	}
	//withdraw amount from account
	public void withdraw(double amount) {
		if (amount <= 0.0) {
			throw new IllegalArgumentException("Withdrawal amount must be > 0.0");
		}
		
		if (amount > balance) {
			throw new IllegalArgumentException("Insufficent funds.");
		}
		
		balance -= amount;
	}
	//return current balance
	public double getBalance() {
		return balance;
	}
	//return account number
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String toString() {
		return String.format("Account Number: %s%nBalance: $%.2f",
				getAccountNumber(), getBalance());
	}
	
}

 