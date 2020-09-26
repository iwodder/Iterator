package com.wodder;

public class Employee {

    private final String fName;
    private final String lName;
    private final long salary;

    public Employee(String fName, String lName, Long salary) {
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "My name is " + getfName() + " " + getlName();
    }
}
