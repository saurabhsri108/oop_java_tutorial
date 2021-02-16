package com.ibcoder.interfaces;

public class TaxReport {
    private TaxCalc calc;

//    public TaxReport(TaxCalc calc) {
//        this.calc = calc;
//    }

    public void printReport(TaxCalc calc) {
        var taxReport = calc.calculateTax();
        System.out.println(taxReport);
    }

//    public void setCalc(TaxCalc calc) {
//        this.calc = calc;
//    }
}
