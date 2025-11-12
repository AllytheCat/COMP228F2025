package com.asc.week6.lab4_5;
	
	// SavingsAccount_AS class extends BankAccount_AS and restricts withdrawals
	public class SavingsAccount_AS extends BankAccount_AS{
		private double balance; 
		
		// constructor passes parameters to superclass
		public SavingsAccount_AS(String firstName, String lastName, String accountNumber, double initialBalance) {
			super(firstName, lastName, accountNumber, initialBalance);
			
			if(initialBalance < 0.0) {
				throw new IllegalArgumentException("Initial balance must be >= 0.0");
			}
			
			this.balance = initialBalance;
		}
		
		public void deposit(double amount) {
			
			if(amount <= 0.0) {
				throw new IllegalArgumentException("Deposit amount must be > 0.0");
			}
			
			balance += amount;
		}
		
		//withdraws amounts from account with validation
		public void withdraw(double amount) {
			if (amount <= 0.0 ) {
				throw new IllegalArgumentException("Withdrawal amount me be > 0.0");
			}
			
			if (amount > balance) {
				throw new IllegalArgumentException("Insufficient funds.");
			}
			
			balance -= amount;
			
		}
		
		// return current balance
		public double getBalance() {
			return balance;
		}
		
		// return string representation of account details
		@Override
		 public String toString() {
	        return String.format("Account Number: %s%nBalance: $%.2f", 
	        		getAccountNumber(), getBalance());
		}
	}



