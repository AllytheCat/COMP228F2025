package com.aa.week3.lab1;

public class MainDriver {
    public static void main(String[] args) {
        DiceRoller diceRoller = new DiceRoller();

        System.out.println("Rolling dice 5 times:");
        for (int i = 1; i <= 5; i++) {
            int result = diceRoller.rollTwoDice();
            System.out.println("Roll " + i + " total: " + result);
            System.out.println("---------------------------");
        }
    }
}

