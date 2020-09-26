package com.wodder;

import java.util.Iterator;

public class DepartmentPrinter {

    private final Department department;

    public DepartmentPrinter(Department department) {
        this.department = department;
    }

    public void printDepartment() {
        printName();
        printManager();
        printDirectReports();
    }

    private void printName() {
        System.out.printf("=======================%s Department=======================%n", department.getDeptName());
    }

    private void printManager() {
        System.out.printf("Manager ---> %s%n", department.getManager());
    }

    private void printDirectReports() {
        System.out.print("\t|_ Direct Reports");
        System.out.println();
        Iterator<Employee> iter = department.deptIter();
        while (iter.hasNext()) {
            System.out.printf("\t\t|_ Employee -> %s%n",iter.next().toString());
        }
    }
}
