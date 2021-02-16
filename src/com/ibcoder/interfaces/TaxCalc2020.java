package com.ibcoder.interfaces;

public class TaxCalc2020 implements TaxCalc {
    private double income;

    public TaxCalc2020(double income) {
        this.income = income;
    }

    @Override
    public double calculateTax() {
        return income * 0.18;
    }
}
