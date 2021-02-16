package com.ibcoder.instancevsstatic;

public class Student {
    long id; // instance variable / field property
    static long countNumberOfStudents; // static field property

    public Student() {
        countNumberOfStudents++;
    }

    long getId() { // instance method
        return id;
    }

    static long getNumberOfStudents() {
        return countNumberOfStudents;
    }
}




























//
//    long id; // instance field
//
//    public Student() {
//        countNumberOfStudents++;
//    }
//
//    static long countNumberOfStudents; // static field
//
//    static long getNumberOfStudents() { // static method
//        return countNumberOfStudents;
//    }
//
//    long getId() { // instance method
//        return this.id;
//    }