package com.asc.midterm;

// hourly applicant class
public class HourlyApplicant extends Applicant{
	
	private double wage;
	private double hours;

	//constructor with validation
	public HourlyApplicant(String firstName, String lastName,
			String sin, double wage, double hours) {
		
		super(firstName, lastName, sin);
		setWage(wage);
		setHours(hours);
	}
	
	
	//wage getter/setter
	public double getWage() {
		return wage;
	}
	
	public void setWage(double wage) {
		if (wage < 0.0) {
			throw new IllegalArgumentException("Wage must be >= 0");
		}

		this.wage = wage;
	}
	
	//hours getter/setter
	public double getHours() {
		return hours;
	}
	
	public void setHours(double hours) {
		if(hours < 0.0 || hours > 168.0) {
			throw new IllegalArgumentException("Hours must be 0-168");
		}
		
		this.hours = hours;
	}
	
	 // calculate earnings
    public double earnings() {
        return wage * hours;
    }

    // show hourly applicant info
    public String toString() {
        return "Hourly Applicant\n" + super.toString() +
               "\nWage: $" + wage +
               "\nHours: " + hours +
               "\nEarnings: $" + earnings();
    }
	

}

