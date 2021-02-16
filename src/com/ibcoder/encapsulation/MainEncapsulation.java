package com.ibcoder.encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {
        var ageCalculator = new AgeCalculator();
        ageCalculator.birthMonth = 10;
        ageCalculator.calculateAge();
        ageCalculator.printAge();
    }
}
