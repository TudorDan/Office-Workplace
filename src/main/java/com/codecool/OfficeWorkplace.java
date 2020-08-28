package com.codecool;

import com.codecool.employees.Employee;
import com.codecool.employees.WorkGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OfficeWorkplace {
    private static OfficeWorkplace instance = null;
    private List<Employee> employeeList = new ArrayList<>();
    private List<WorkGroup> workGroupList = new ArrayList<>();

    public static OfficeWorkplace getInstance() {
        if (instance == null) {
            instance = new OfficeWorkplace();
        }
        return instance;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void addWorkGroup(WorkGroup workGroup) {
        workGroupList.add(workGroup);
    }

    public WorkGroup getWorkGroupByEmployee(UUID id) {
        for (WorkGroup workGroup : workGroupList) {
            List<Employee> members = workGroup.getMembers();
            for (Employee employee : members) {
                if (employee.getId() == id) {
                    return workGroup;
                }
            }
        }
        return null;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
}
