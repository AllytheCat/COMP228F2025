package com.asc.week1.assign1;

import java.util.Scanner;

public class LiterstoGallons {
    public void convertLitersToGallons() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter volume in liters: ");
        double liters = sc.nextDouble();

        double gallons = liters * 0.264172;
        System.out.println("Volume in gallons: " + gallons);
    }
}
