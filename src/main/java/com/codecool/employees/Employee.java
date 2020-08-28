package com.codecool.employees;

import com.codecool.utilities.EmployeeType;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class Employee {
    private final UUID id;
    private EmployeeType employeeType;
    private final String name;
    private BigDecimal salary;

    public Employee(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getGroupName() {
        return null;
    }

    public void printSalary() {
        System.out.println("Employee " + id + " " + employeeType + " " + name + " has a salary of: " + salary + " $.");
    }
}
