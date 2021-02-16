package com.ibcoder.classobjectexplaination;

public class Student {
//  variable declaration
    public long id;
    public String name;
    public String gender;
    public long rollNumber;
    public String[] courses = new String[2];

//  method declaration
    public boolean updateNameInfo(String name) {
        this.name = name;
        return true;
    }
}
