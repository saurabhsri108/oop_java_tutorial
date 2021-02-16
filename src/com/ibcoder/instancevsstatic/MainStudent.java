package com.ibcoder.instancevsstatic;

public class MainStudent {
    public static void main(String[] args) {
        System.out.println(Student.getNumberOfStudents());
        var student1 = new Student();
        System.out.println(Student.getNumberOfStudents());
        var student2 = new Student();
        System.out.println(Student.getNumberOfStudents());

//        student1.id = 1;
//        student2.id = 2;
//
//
//
//        System.out.println(student1.getId());
//        System.out.println(student2.getId());
    }
}











//    Student s1 = new Student();
//    Student s2 = new Student();
//    Student s3 = new Student();
//    Student s4 = new Student();
//
//        System.out.println(Student.getNumberOfStudents());