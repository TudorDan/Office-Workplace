package com.codecool.employees;

import com.codecool.OfficeWorkplace;
import com.codecool.utilities.EmployeeType;

import java.math.BigDecimal;
import java.util.UUID;

public abstract class Employee {
    protected final UUID id;
    private EmployeeType employeeType;
    private final String name;
    private BigDecimal salary;
    protected boolean isAssignedToWorkGroup;

    public Employee(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.isAssignedToWorkGroup = false;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public void setAssignedToWorkGroup(boolean assignedToWorkGroup) {
        isAssignedToWorkGroup = assignedToWorkGroup;
    }

    public UUID getId() {
        return id;
    }

    public String getWorkGroupName() {
        if (isAssignedToWorkGroup) {
            return "Employee " + name + " workgroup is: "
                    + OfficeWorkplace.getInstance().getWorkGroupByEmployee(id).getGroupName();
        } else {
            return "Employee " + name + " is not assigned to a Work Group.";
        }
    }

    public String getName() {
        return name;
    }

    public void printSalary() {
        System.out.println("Employee " + id + " " + employeeType + " " + name + " has a salary of: " + salary + " $.");
    }

    public void printGroup() {
        System.out.println(getWorkGroupName());
    }
}
