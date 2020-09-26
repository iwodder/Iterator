package com.wodder;

import java.util.Iterator;
import java.util.List;

public class DepartmentIterator implements Iterator<Employee> {

    private final List<Employee> employees;
    private int idx = 0;

    public DepartmentIterator(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return idx < employees.size();
    }

    @Override
    public Employee next() {
        return employees.get(idx++);
    }
}

