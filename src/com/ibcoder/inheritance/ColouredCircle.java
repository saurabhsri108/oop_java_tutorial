package com.ibcoder.inheritance;

public class ColouredCircle extends Circle {
    private String colour;

    public ColouredCircle() {
//        System.out.println("I am coloured circle");
    }

    public ColouredCircle(double radius, String colour) {
        super(radius);
        this.colour = colour;
    }

    public ColouredCircle(String colour) {
        this.colour = colour;
    }


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "This color is " + colour;
    }
}


















//
//    private String colour;
//
//    public ColouredCircle(String colour) {
//        this.colour = colour;
//    }
//
//    public ColouredCircle(double radius, String colour) {
//        super(radius);
//        this.colour = colour;
//    }
//
//    public String getColour() {
//        return "Colour of circle is " + this.colour;
//    }