package com.asc.midterm;

//base class for all applicants
public abstract class Applicant {
	
	protected final String firstName;
	protected final String lastName;
	protected final String socialInsuranceNumber;
	
	//constructor with validation
	public Applicant (String firstName, String lastName, String sin) {
		
		if(firstName == null || firstName.isEmpty() ||
			lastName == null || lastName.isEmpty() ||
			sin == null || sin.isEmpty()) {
			
			throw new IllegalArgumentException("Fields can't be empty");
			
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialInsuranceNumber = sin;
	}
	
	//method to be overridden
	public abstract double earnings();
	
	//show applicant info
	public String toString() {
		
		return "Name:" + firstName + "" + lastName + "\nSIN: " + socialInsuranceNumber;
		
	}
	
}
