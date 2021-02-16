package com.ibcoder.interfaces;

public class TaxCalc2018 implements TaxCalc {
    private double income;

    public TaxCalc2018(double income) {
        this.income = income;
    }

    @Override
    public double calculateTax() {
        return income * 0.15;
    }
}
