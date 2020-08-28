package com.codecool.employees;

import com.codecool.utilities.EmployeeType;
import com.codecool.utilities.ExperienceLevel;

import java.math.BigDecimal;

public class OfficeWorker extends Employee {
    private ExperienceLevel experienceLevel;

    public OfficeWorker(String name, ExperienceLevel experienceLevel) {
        super(name);
        setEmployeeType(EmployeeType.OFFICEWORKER);

        this.experienceLevel = experienceLevel;

        BigDecimal salary;
        switch (experienceLevel) {
            case JUNIOR:
                salary = BigDecimal.valueOf(1250);
                setSalary(salary);
                break;
            case SENIOR:
                salary = BigDecimal.valueOf(1700);
                setSalary(salary);
                break;
        }
    }
}
