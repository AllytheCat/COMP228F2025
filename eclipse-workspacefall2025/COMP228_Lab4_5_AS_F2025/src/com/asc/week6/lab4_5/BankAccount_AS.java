package com.asc.week6.lab4_5;

//BankAccount_AS extends Account_AS and implements core banking operations.
// Includes method overriding, method overloading, and a static deposit method.
 
public class BankAccount_AS extends Account_AS {
    private double balance;

    // Constructor initializes inherited attributes and validates initial balance
    public BankAccount_AS(String firstName, String lastName, String accountNumber, double initialBalance) {
        super(firstName, lastName, accountNumber);
        if (initialBalance < 0.0) {
            throw new IllegalArgumentException("Initial balance must be >= 0.0");
        }
        this.balance = initialBalance;
    }

    // Method overriding: adds balance info to display
    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.printf("Balance: $%.2f%n", balance);
    }

    // Method overloading: interest calculation with rate only
    public double calculateInterest(double rate) {
        return balance * rate;
    }

    // Method overloading: interest calculation with rate and years
    public double calculateInterest(double rate, int years) {
        return balance * rate * years;
    }

    // Static method (optional): deposit calculation without modifying object
    public static double deposit(double currentBalance, double amount) {
        if (amount <= 0.0) {
            throw new IllegalArgumentException("Deposit must be > 0.0");
        }
        return currentBalance + amount;
    }

    // Instance method: deposit into account
    public void deposit(double amount) {
        if (amount <= 0.0) {
            throw new IllegalArgumentException("Deposit must be > 0.0");
        }
        balance += amount;
    }

    // Instance method: withdraw from account
    public void withdraw(double amount) {
        if (amount <= 0.0) {
            throw new IllegalArgumentException("Withdrawal must be > 0.0");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds.");
        }
        balance -= amount;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // String representation of account
    @Override
    public String toString() {
        return String.format("Account Number: %s%nBalance: $%.2f", getAccountNumber(), getBalance());
    }
}
