package com.codecool.employees;

import com.codecool.utilities.EmployeeType;
import com.codecool.utilities.Utility;

import java.math.BigDecimal;

public class SalesPerson extends Employee {

    public SalesPerson(String name) {
        super(name);
        setEmployeeType(EmployeeType.SALESPERSON);

        BigDecimal salary = BigDecimal.valueOf(Utility.getRandomNumberInRange(1500, 2000));
        setSalary(salary);
    }
}
