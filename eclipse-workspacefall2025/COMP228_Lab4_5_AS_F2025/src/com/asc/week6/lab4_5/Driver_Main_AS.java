package com.asc.week6.lab4_5;

import java.util.Scanner;

//Driver_Main_AS tests the functionality of SavingsAccount_AS.
//Demonstrates dynamic input, method overriding, overloading, and static method usage.

public class Driver_Main_AS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dynamic input from user
        System.out.print("Enter First Name: ");
        String fname = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lname = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();

        // Create SavingsAccount_AS object using dynamic input
        SavingsAccount_AS account = new SavingsAccount_AS(fname, lname, accNo, balance);

        // Display initial account info
        System.out.println("\nInitial account details:");
        account.displayAccountInfo();

        // Deposit operation
        System.out.print("\nEnter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        System.out.printf("After depositing $%.2f:%n%s%n", depositAmount, account);

        // Withdrawal operation with error handling
        System.out.print("\nEnter withdrawal amount: ");
        double withdrawAmount = scanner.nextDouble();
        try {
            account.withdraw(withdrawAmount);
            System.out.printf("After withdrawing $%.2f:%n%s%n", withdrawAmount, account);
        } catch (IllegalArgumentException e) {
            System.out.printf("Withdrawal error: %s%n", e.getMessage());
        }

        // Interest calculations using method overloading
        System.out.println("\n--- Interest Calculations ---");
        System.out.printf("1-Year Interest at 5%%: $%.2f%n", account.calculateInterest(0.05));
        System.out.printf("3-Year Interest at 5%%: $%.2f%n", account.calculateInterest(0.05, 3));

        // Static deposit example
        double newBalance = BankAccount_AS.deposit(account.getBalance(), 500.00);
        System.out.printf("\nBalance after static deposit of $500: $%.2f%n", newBalance);

        // Final account state
        System.out.printf("\nFinal account state:%n%s%n", account);
        scanner.close();
    }
}

