package com.ibcoder.refactoring;

import java.text.NumberFormat;

public class CalculationLogic {

    private final static byte PERCENT = 100;
    private final static byte TOTAL_MONTHS = 12;

    private final int principal;
    private final double annualInterest;
    private final int numberOfYears;

    public CalculationLogic(int principal, double annualInterest, int numberOfYears) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.numberOfYears = numberOfYears;
    }

    private double getMonthlyBalance(
            short numberOfPaymentsMade
    ) {
        double monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        double balance = principal
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return balance;
    }

    public String getMonthlyMortgagePayment() {
        double monthlyInterest = getMonthlyInterest();
        int numberOfPayments = getNumberOfPayments();

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return NumberFormat.getCurrencyInstance().format(mortgage);
    }

    public double[] getBalances() {
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= getNumberOfPayments(); month++) {
            balances[month - 1] = getMonthlyBalance(month);
        }
        return balances;
    }


    private int getNumberOfPayments() {
        return numberOfYears * TOTAL_MONTHS;
    }

    private double getMonthlyInterest() {
        return annualInterest / PERCENT / TOTAL_MONTHS;
    }
}
