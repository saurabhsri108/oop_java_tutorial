package com.ibcoder.polymorphism;

import java.util.Objects;

public class MainPoly {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(), new Square()};

        for (var shape : shapes)
            shape.draw();

    }
}
