package com.ibcoder.refactoring;

import java.text.NumberFormat;

public class PrintingLogic {

    private CalculationLogic calculationLogic;

    public PrintingLogic(CalculationLogic calculationLogic) {
        this.calculationLogic = calculationLogic;
    }

    public void printPaymentSchedule(int numberOfYears) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (var balance: calculationLogic.getBalances())
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));

    }

    public void printMonthlyMortgagePayment() {
        String mortgageFormatted = calculationLogic.getMonthlyMortgagePayment();
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}
