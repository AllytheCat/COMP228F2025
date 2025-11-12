package com.asc.week1.assign1;

import java.util.Scanner;

public class MilestoKilometers {
    public void convertMilesToKm() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in miles: ");
        double miles = sc.nextDouble();

        double kilometers = miles * 1.60934;
        System.out.println("Distance in kilometers: " + kilometers);
    }
}