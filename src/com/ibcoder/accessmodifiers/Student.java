package com.ibcoder.accessmodifiers;

public class Student {
//    private -> default:package-private -> protected -> public
//    Don't use private and protected for class. It will give error.
    protected String name;

    private boolean updateNameInfo(String name) {
        this.name = name;
        return true;
    }
}

















//    public String name;
//
//    boolean updateNameInfo(String name) {
//        this.name = name;
//        return true;
//    }