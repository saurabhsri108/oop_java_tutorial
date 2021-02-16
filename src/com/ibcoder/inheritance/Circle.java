package com.ibcoder.inheritance;

public class Circle {
    private double radius;

    public Circle() {
//        System.out.println("I am circle class");
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }


}