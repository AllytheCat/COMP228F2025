package com.asc.week1.assign1;

import java.util.Scanner;

public class CurrencyConverter {
    public void convertCADtoUSD() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in CAD: ");
        double cad = sc.nextDouble();

        double exchangeRate = 0.74; 
        double usd = cad * exchangeRate;

        System.out.println("Equivalent amount in USD: $" + usd);
    }
}
