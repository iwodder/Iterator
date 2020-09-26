package com.wodder;

public class App {
    public static void main( String[] args ) {

        Department sales = new Department("Sales", new Employee("Michael", "Scott", 50000L));
        sales.addEmployee(new Employee("Dwight", "Schrute", 49000L));
        sales.addEmployee(new Employee("Jim", "Halpert", 49001L));
        sales.addEmployee(new Employee("Andrew", "Bernard", 45000L));
        sales.addEmployee(new Employee("Stanley", "Hudson", 50000L));

        DepartmentPrinter printer = new DepartmentPrinter(sales);
        printer.printDepartment();
    }
}
