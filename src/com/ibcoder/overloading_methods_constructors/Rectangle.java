package com.ibcoder.overloading_methods_constructors;

public class Rectangle {
    private double x;
    private double y;

    public Rectangle(double x) {
        this.x = this.y = x;
    }

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getArea() {
        return x * y;
    }

    public double getArea(double nX) {
        return nX * y;
    }

    public double getArea(double nX, double nY) {
        return nX * nY;
    }
}






























//    private final int x;
//    private final int y;
//
//    // Overloading Constructors
//
//    public Rectangle(int x) {
//        this.x = x;
//        this.y = x;
//    }
//
//    public Rectangle(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    // Overloading Method
//
//    public double Area() {
//        return x * y;
//    }
//
//    public double Area(int nX) {
//        return nX * y;
//    }
//
//    public double Area(int nX, int nY) {
//        return nX * nY;
//    }