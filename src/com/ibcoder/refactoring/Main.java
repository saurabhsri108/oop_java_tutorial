package com.ibcoder.refactoring;

public class Main {

    public static void main(String[] args) {
        int principal = (int) InputLogic.readInput("Principal: ", 1000, 1_000_000);
        double annualInterest = InputLogic.readInput("Annual Interest Rate: ", 1, 30);
        int numberOfYears = (int) InputLogic.readInput("Period (Years): ", 1, 30);

        var calc = new CalculationLogic(principal, annualInterest, numberOfYears);
        var repo = new PrintingLogic(calc);

        repo.printMonthlyMortgagePayment();
        repo.printPaymentSchedule(numberOfYears);

    }

}

// https://gist.github.com/vasudeveloper001/8c4e4f6dff4708e0b7bfc6c74a0bfba8