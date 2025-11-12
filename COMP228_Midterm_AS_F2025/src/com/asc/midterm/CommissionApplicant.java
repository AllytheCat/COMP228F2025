package com.asc.midterm;

//commission applicant class
public class CommissionApplicant extends Applicant {
	
 private double grossSales;
 private double commissionRate;

 // constructor with validation
 public CommissionApplicant(String firstName, String lastName, String sin, 
		 double grossSales, double commissionRate) {
	 
     super(firstName, lastName, sin);
     setGrossSales(grossSales);
     setCommissionRate(commissionRate);
 }

 // sales getter/setter
 public double getGrossSales() { 
	 return grossSales; 
	 }
 
 public void setGrossSales(double grossSales) {
     if (grossSales < 0.0) {
    	 
    	 throw new IllegalArgumentException("Sales must be >= 0");
     }
     this.grossSales = grossSales;
 }

 
 // rate getter/setter
 public double getCommissionRate() { 
	 
	 return commissionRate; 
	 }
 public void setCommissionRate(double commissionRate) {
	 
     if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException("Rate must be > 0 and < 1");
     }
     this.commissionRate = commissionRate;
 }

 // calculate earnings
 public double earnings() {
     return grossSales * commissionRate;
 }

 // show commission applicant info
 public String toString() {
     return "Commission Applicant\n" + super.toString() +
            "\nSales: $" + grossSales +
            "\nRate: " + commissionRate +
            "\nEarnings: $" + earnings();
 }
}
