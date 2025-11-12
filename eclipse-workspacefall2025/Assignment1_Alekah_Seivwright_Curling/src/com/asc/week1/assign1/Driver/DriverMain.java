package com.asc.week1.assign1.Driver;

import java.util.Scanner;
import com.asc.week1.assign1.GradeCalculation;
import com.asc.week1.assign1.MilestoKilometers;
import com.asc.week1.assign1.LiterstoGallons;
import com.asc.week1.assign1.CurrencyConverter;




public class DriverMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Grade Calculation");
            System.out.println("2. Miles to Kilometers Conversion");
            System.out.println("3. Liters to Gallons Conversion");
            System.out.println("4. CAD to USD Conversion");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    GradeCalculation gradeCalc = new GradeCalculation();
                    gradeCalc.calculateGrade();
                    break;
                case 2:
                    MilestoKilometers milesConv = new MilestoKilometers();
                    milesConv.convertMilesToKm();
                    break;
                case 3:
                    LiterstoGallons litersConv = new LiterstoGallons();
                    litersConv.convertLitersToGallons();
                    break;
                case 4:
                    CurrencyConverter currencyConv = new CurrencyConverter();
                    currencyConv.convertCADtoUSD();
                    break;
                case 5:
                    continueProgram = false;
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
