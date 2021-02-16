package com.ibcoder.compareobjects;

public class MainCompare {
    public static void main(String[] args) {
        var line1 = new Line(10);
        var line2 = new Line(10);

        System.out.println(line1.hashCode());
        System.out.println(line2.hashCode());
        System.out.println(line1.equals(line2));
    }
}
