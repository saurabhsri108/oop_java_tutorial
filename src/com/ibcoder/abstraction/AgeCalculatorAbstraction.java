package com.ibcoder.abstraction;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculatorAbstraction {
    private short birthYear;
    private byte birthMonth;
    private byte birthDay;
    private Period period;

    public AgeCalculatorAbstraction() {
        // Get user's date of birth
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year of birth [1900 - 2021]: ");
        this.setBirthYear(in.nextShort()); // YYYY
        System.out.print("Enter month of birth [1-12]: ");
        this.setBirthMonth(in.nextByte(), 1, 12); // MM [1-12]
        System.out.print("Enter day of birth [1-31]: ");
        this.setBirthDay(in.nextByte()); // DD [01-31]

        this.calculateAge();
    }

    private void calculateAge() {
        LocalDate today = LocalDate.now(); //Today's date
        LocalDate birthday = LocalDate.of(getBirthYear(), getBirthMonth(), getBirthDay());
        period = Period.between(birthday, today);
    }

    public void printAge() {
        System.out.printf("""
                Your age: %d years, %d months, and %d days
                """, period.getYears(), period.getMonths(), period.getDays());
    }

    private short getBirthYear() {
        return birthYear;
    }

    private void setBirthYear(short birthYear) {
        if(birthYear < 1900 || birthYear > 2020)
            throw new IllegalArgumentException("BirthYear should lie between 1900 and 2020");
        this.birthYear = birthYear;
    }

    private byte getBirthMonth() {
        return birthMonth;
    }

    private void setBirthMonth(byte birthMonth, int min, int max) {
        if(birthMonth < min || birthMonth > max)
            throw new IllegalArgumentException("BirthMonth should lie between 1 and 12");
        this.birthMonth = birthMonth;
    }

    private byte getBirthDay() {
        return birthDay;
    }

    private void setBirthDay(byte birthDay) {
        if(birthDay < 1 || birthDay > 31)
            throw new IllegalArgumentException("Birthday should lie between 1 and 31");
        this.birthDay = birthDay;
    }
}
