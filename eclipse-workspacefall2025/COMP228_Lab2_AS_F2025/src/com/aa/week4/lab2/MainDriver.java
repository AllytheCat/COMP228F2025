package com.aa.week4.lab2;

import java.math.BigDecimal;

public class MainDriver {

	 public static void main(String[] args) {
	        Interest d1 = new Interest(10.5, 5.5, 2);
	        Interest d2 = new Interest(20.75, 4.25, 3);
	        Interest d3 = new Interest(15.3, 3.8, 4);

	        System.out.println("Double-based Interest Calculations:");
	        System.out.printf("SI: $%.2f, CI: $%.2f\n", d1.SimpleInterest(d1.getPrincipal(), d1.getRate(), d1.getTime()), d1.CompoundInterest(d1.getPrincipal(), d1.getRate(), d1.getTime()));
	        System.out.printf("SI: $%.2f, CI: $%.2f\n", d2.SimpleInterest(d2.getPrincipal(), d2.getRate(), d2.getTime()), d2.CompoundInterest(d2.getPrincipal(), d2.getRate(), d2.getTime()));
	        System.out.printf("SI: $%.2f, CI: $%.2f\n", d3.SimpleInterest(d3.getPrincipal(), d3.getRate(), d3.getTime()), d3.CompoundInterest(d3.getPrincipal(), d3.getRate(), d3.getTime()));

	        BigDecimal principal1 = new BigDecimal("12.6");
	        BigDecimal rate1 = new BigDecimal("2.9");
	        int time1 = 5;

	        BigDecimal principal2 = new BigDecimal("18.9");
	        BigDecimal rate2 = new BigDecimal("6.1");
	        int time2 = 1;

	        Interest b1 = new Interest(principal1.doubleValue(), rate1.doubleValue(), time1);
	        Interest b2 = new Interest(principal2.doubleValue(), rate2.doubleValue(), time2);

	        System.out.println("\nBigDecimal-based Interest Calculations:");
	        System.out.println("SI: $" + b1.SimpleInterest(principal1, rate1, time1) + ", CI: $" + b1.CompoundInterest(principal1, rate1, time1));
	        System.out.println("SI: $" + b2.SimpleInterest(principal2, rate2, time2) + ", CI: $" + b2.CompoundInterest(principal2, rate2, time2));
	    }
}
