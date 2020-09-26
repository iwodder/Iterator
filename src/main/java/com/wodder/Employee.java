package com.wodder;

record Employee(String fName, String lName, Long salary) {

    @Override
    public String toString() {
        return "My name is " + fName() + " " + lName();
    }
}
