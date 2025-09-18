package com.asc.week1.assign1;

import java.util.Scanner;

public class GradeCalculation {

	public void calculateGrade() {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter marks for Subject 1: ");
	        int marks1 = sc.nextInt();

	        System.out.print("Enter marks for Subject 2: ");
	        int marks2 = sc.nextInt();

	        int average = (marks1 + marks2) / 2;
	        String grade;

	        if (average >= 90) {
	            grade = "A";
	        } else if (average >= 80) {
	            grade = "B";
	        } else if (average >= 70) {
	            grade = "C";
	        } else if (average >= 60) {
	            grade = "D";
	        } else {
	            grade = "F";
	        }

	        System.out.println("Average Marks: " + average);
	        System.out.println("Grade: " + grade);
	}

}
