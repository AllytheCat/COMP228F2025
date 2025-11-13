package com.aa.week4.lab2;

import java.math.BigDecimal;

public class Interest {

    private double principal;
    private double rate;
    private int time;

    public Interest(double principal, double rate, int time) {
     
        if (principal <= 0 || principal >= 60 || rate <= 0 || rate >= 60 || time <= 0 || time >= 100) {
            throw new IllegalArgumentException("Values out of valid range.");
        }
        if (principal % 1 == 0 || rate % 1 == 0) {
            throw new IllegalArgumentException("Principal and rate must be decimal values.");
        }

        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double SimpleInterest(double principal, double rate, int time) {
        return (principal * rate * time) / 100;
    }

    public double CompoundInterest(double principal, double rate, int time) {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }

    public BigDecimal SimpleInterest(BigDecimal principal, BigDecimal rate, int time) {
        return principal.multiply(rate).multiply(BigDecimal.valueOf(time)).divide(BigDecimal.valueOf(100));
    }

    
    public BigDecimal CompoundInterest(BigDecimal principal, BigDecimal rate, int time) {
        BigDecimal onePlusRate = rate.divide(BigDecimal.valueOf(100)).add(BigDecimal.ONE);
        BigDecimal compoundFactor = onePlusRate.pow(time);
        return principal.multiply(compoundFactor).subtract(principal);
    }

    public double getPrincipal() {
        return principal;
    }

    public double getRate() {
        return rate;
    }

    public int getTime() {
        return time;
    }
}