package com.aa.week3.lab1;

import java.security.SecureRandom;

public class DiceRoller {
    private SecureRandom secureRandom;

    public DiceRoller() {
        secureRandom = new SecureRandom();
    }

    public int rollDie() {
        return secureRandom.nextInt(6) + 1;
    }

    public int rollTwoDice() {
        int die1 = rollDie();
        int die2 = rollDie();
        System.out.println("Rolled: " + die1 + " and " + die2);
        return die1 + die2;
    }
}
