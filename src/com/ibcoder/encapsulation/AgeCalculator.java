package com.ibcoder.encapsulation;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public short birthYear;
    public byte birthMonth;
    public byte birthDay;
    public Period period;

    public AgeCalculator() {
        // Get user's date of birth
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year of birth [1900 - 2021]: ");
        this.birthYear = in.nextShort(); // YYYY
        System.out.print("Enter month of birth [1-12]: ");
        this.birthMonth = in.nextByte(); // MM [1-12]
        System.out.print("Enter day of birth [1-31]: ");
        this.birthDay = in.nextByte(); // DD [01-31]
    }

    public void calculateAge() {
        LocalDate today = LocalDate.now(); //Today's date
        LocalDate birthday = LocalDate.of(birthYear, birthMonth, birthDay);
        period = Period.between(birthday, today);
    }

    public void printAge() {
        System.out.printf("""
                Your age: %d years, %d months, and %d days
                """, period.getYears(), period.getMonths(), period.getDays());
    }
}




























//
//    // start with public declaration
//    public short birthYear;
//    public byte birthMonth;
//    public byte birthDay;
//
//    private Period period;
//
//    public AgeCalculator() {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter year of birth [YYYY]: ");
//        this.birthYear = in.nextShort();
//        System.out.print("Enter month of birth [1-12]: ");
//        this.birthMonth = in.nextByte();
//        System.out.print("Enter day of birth [1-31]: ");
//        this.birthDay = in.nextByte();
//
////        this.calculateAge();
//    }
//
//    public void calculateAge() {
//        LocalDate today = LocalDate.now(); //Today's date
//        LocalDate birthday = LocalDate.of(getBirthYear(), getBirthMonth(), getBirthDay()); //Birth date
//        this.period = Period.between(birthday, today);
//    }
//
//    public void printAge() {
//        System.out.printf("""
//                Your age: %d years, %d months, and %d days
//                """, this.period.getYears(), this.period.getMonths(), this.period.getDays());
//    }
//
//    public void setBirthYear(int birthYear) {
//        if (birthYear < 1900 || birthYear > 2021)
//            throw new IllegalArgumentException("BirthYear should be between 1900 and 2021");
//
//        this.birthYear = (short) birthYear;
//
//    }
//
//    public void setBirthMonth(int birthMonth) {
//        if (birthMonth < 1 || birthMonth > 12)
//            throw new IllegalArgumentException("BirthMonth should be between 1 and 12");
//
//        this.birthMonth = (byte) birthMonth;
//    }
//
//    public void setBirthDay(int birthDay) {
//        if (birthDay < 1 || birthDay > 31)
//            throw new IllegalArgumentException("Birthday should be between 1 and 31");
//
//        this.birthDay = (byte) birthDay;
//    }
//
//
//
//    public short getBirthYear() {
//        return birthYear;
//    }
//
//    public byte getBirthMonth() {
//        return birthMonth;
//    }
//
//    public byte getBirthDay() {
//        return birthDay;
//    }

    // Age calculator
//    AgeCalculator myAge = new AgeCalculator();
//    myAge.setBirthMonth(4);
//    myAge.calculateAge();
//    myAge.printAge();