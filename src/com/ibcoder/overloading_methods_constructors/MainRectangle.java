package com.ibcoder.overloading_methods_constructors;

public class MainRectangle {
    public static void main(String[] args) {
        var square = new Rectangle(2);
        var rectangle = new Rectangle(1, 2);

        System.out.println(square.getArea());
        System.out.println(square.getArea(4, 4));

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getArea(1));
        System.out.println(rectangle.getArea(3, 4));
    }
}




























//    var square = new Rectangle(2);
//    var rectangle = new Rectangle(1, 2);
//
//        System.out.println(square.Area());
//
//                System.out.println(rectangle.Area());
//                System.out.println(rectangle.Area(4));
//                System.out.println(rectangle.Area(4, 3));