package com.codecool.employees;

import com.codecool.utilities.EmployeeType;

import java.util.Currency;
import java.util.UUID;

public abstract class Employee {
    private UUID id;
    private EmployeeType employeeType;
    private String name;
    private Currency salary;

    public Employee(String name) {
        id = UUID.randomUUID();
        this.name = name;
    }

    public String getGroupName() {
        return null;
    }
}
