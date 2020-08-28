package com.codecool.employees;

import com.codecool.OfficeWorkplace;
import com.codecool.utilities.EmployeeType;

import java.math.BigDecimal;

public class GroupLead extends Employee {

    public GroupLead(String name) {
        super(name);
        setEmployeeType(EmployeeType.GROUPLEAD);

        BigDecimal salary = BigDecimal.valueOf(1800);
        setSalary(salary);
    }

    public int getGroupEmployeesNr() {
        WorkGroup workGroup = OfficeWorkplace.getInstance().getWorkGroupByEmployee(id);
        return workGroup.getMembersNr();
    }

    public void raiseSalary() {
        if (isAssignedToWorkGroup) {
            BigDecimal salary = BigDecimal.valueOf(1800 + (getGroupEmployeesNr() * 200));
            setSalary(salary);
        }
    }
}
