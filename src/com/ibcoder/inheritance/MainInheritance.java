package com.ibcoder.inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        var circle = new Circle();
        var blueCircle = new ColouredCircle("Blue");
        prints(blueCircle);
        prints(circle);
    }

    private static void prints(Circle circle) {
        if(circle instanceof ColouredCircle) {
            var colouredCircle = (ColouredCircle) circle;
            colouredCircle.setColour("red");
        }
        System.out.println(circle);
    }

}