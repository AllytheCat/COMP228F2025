package com.asc.week6.lab4_5;

// Account_AS is the base class for all account types. 
//defines final attributes for account holder identity and provides a display method.

public class Account_AS {
    protected final String firstName;
    protected final String lastName;
    protected final String accountNumber;

    // Constructor to initialize final attributes
    public Account_AS(String firstName, String lastName, String accountNumber) {
        if (firstName == null || lastName == null || accountNumber == null ||
            firstName.isEmpty() || lastName.isEmpty() || accountNumber.isEmpty()) {
            throw new IllegalArgumentException("Name and account number cannot be empty.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
    }

    // Method to display account holder info
    public void displayAccountInfo() {
        System.out.printf("Account Holder: %s %s%nAccount Number: %s%n",
                firstName, lastName, accountNumber);
    }
}
