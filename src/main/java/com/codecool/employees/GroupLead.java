package com.codecool.employees;

import com.codecool.utilities.EmployeeType;

import java.math.BigDecimal;

public class GroupLead extends Employee {

    public GroupLead(String name) {
        super(name);
        setEmployeeType(EmployeeType.GROUPLEAD);

        int groupEmployeesNr = getGroupEmployeesNr();
        BigDecimal salary = BigDecimal.valueOf(1800 + (groupEmployeesNr * 200));
        setSalary(salary);
    }

    public int getGroupEmployeesNr() {
        return 0;
    }
}