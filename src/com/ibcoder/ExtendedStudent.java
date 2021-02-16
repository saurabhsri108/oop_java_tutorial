package com.ibcoder;


import com.ibcoder.accessmodifiers.Student;

public class ExtendedStudent extends Student {
    boolean updateNameInfo(String name) {
        this.name = name;
        return true;
    }
}
