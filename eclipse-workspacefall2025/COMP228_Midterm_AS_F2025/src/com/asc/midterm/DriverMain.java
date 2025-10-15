package com.asc.midterm;

//test class for all applicants
public class DriverMain {
 public static void main(String[] args) {
	 
     // hourly applicants
     HourlyApplicant h1 = new HourlyApplicant("Alekah", "Smith", "123456789", 20.0, 40.0);
     HourlyApplicant h2 = new HourlyApplicant("Jordan", "Lee", "987654321", 18.5, 35.0);
     HourlyApplicant h3 = new HourlyApplicant("Maya", "Chen", "456789123", 22.0, 30.0);

     // commission applicants
     CommissionApplicant c1 = new CommissionApplicant("Liam", "Patel", "321654987", 5000.0, 0.10);
     CommissionApplicant c2 = new CommissionApplicant("Noah", "Garcia", "654987321", 7000.0, 0.12);
     CommissionApplicant c3 = new CommissionApplicant("Emma", "Nguyen", "789321654", 6000.0, 0.15);

     // show all info
     System.out.println(h1 + "\n");
     System.out.println(h2 + "\n");
     System.out.println(h3 + "\n");

     System.out.println(c1 + "\n");
     System.out.println(c2 + "\n");
     System.out.println(c3 + "\n");
 	}
}