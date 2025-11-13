package com.asc.week5.lab3;

// Driver class to test SavingsAccount_AS functionality.

public class Driver_Main_AS {
	
	public static void main(String[] args) {
		// Create account 
		SavingsAccount_AS account = new SavingsAccount_AS("AS12345", 1500.00);
		System.out.println("Initial account details:");
		System.out.println(account);
		
		// Deposit $1000
		account.deposit(1000.00);
		System.out.printf("%nAfter depositing $1000:%n%s%n", account);
		
		// Withdraw $600
		account.withdraw(600.00);
		System.out.printf("%nAfter withdrawing $600:%n%s%n", account);
		
		// Attempt to withdraw more than within the account
		try {
			account.withdraw(2500.00);
		} catch (IllegalArgumentException e) {
			System.out.printf("%nAttempted to withdraw $2500:%n%s%n", e.getMessage());
		}
		
		System.out.printf("%nFinal account state:%n%s%n", account);
		
		
	}

}
