package com.ibcoder.compareobjects;

import java.util.Objects;

public class Line {
    private int length;

    public Line(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return length == line.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }

    //    @Override
//    public boolean equals(Object obj) {
//        if(this == obj) return true;
//
//        if(!(obj instanceof Line)) return false;
//
//        var incomingLine = (Line) obj;
//        return incomingLine.length == this.length;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(length);
//    }
}
