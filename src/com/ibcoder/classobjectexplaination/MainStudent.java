package com.ibcoder.classobjectexplaination;

import java.util.Arrays;

public class MainStudent {
    public static void main(String[] args) {
//      1. Instantiate the object
        Student iStudent = new Student();

//      Printing the values of iStudent object
        System.out.println(iStudent.id);
        System.out.println(iStudent.name);
        System.out.println(iStudent.gender);
        System.out.println(iStudent.rollNumber);
        System.out.println(Arrays.toString(iStudent.courses));
        System.out.println("----------------------------");
        System.out.println();

//      2. Setting the student's state
        iStudent.id = 1;
        iStudent.name = "Saurabh";
        iStudent.gender = "Male";
        iStudent.rollNumber = 12;
        iStudent.courses[0] = "Java";
        iStudent.courses[1] = "C++";

//      Printing the values again
        System.out.println(iStudent.id);
        System.out.println(iStudent.name);
        System.out.println(iStudent.gender);
        System.out.println(iStudent.rollNumber);
        System.out.println(Arrays.toString(iStudent.courses));
        System.out.println("----------------------------");
        System.out.println();

//      3. Method calling when needed
        var result = iStudent.updateNameInfo("John");

//      Printing the name value
        System.out.println(iStudent.name);
    }
}
