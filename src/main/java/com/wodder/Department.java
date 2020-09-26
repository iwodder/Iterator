package com.wodder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Department {

    private final String deptName;
    private final Employee manager;
    private final List<Employee> employeeList = new ArrayList<>();


    public Department(String deptName, Employee manager) {
        this.deptName = deptName;
        this.manager = manager;
    }

    public boolean addEmployee(Employee e) {
        return employeeList.add(e);
    }

    public Iterator<Employee> deptIter() {
        return new DepartmentIterator(employeeList);
    }

    public String getDeptName() {
        return deptName;
    }

    public Employee getManager() {
        return manager;
    }
}
