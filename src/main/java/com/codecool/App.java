package com.codecool;

import com.codecool.employees.*;
import com.codecool.utilities.EmployeeType;
import com.codecool.utilities.ExperienceLevel;
import com.codecool.utilities.GroupType;

/**
 * Project simulation!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Setting office workplace.." );
        OfficeWorkplace workplace = OfficeWorkplace.getInstance();
        System.out.println("workplace set!");

        System.out.println("Hiring employees..");
        workplace.addEmployee(new SalesPerson("Plutarch"));
        workplace.addEmployee(new SalesPerson("Xenophon"));
        workplace.addEmployee(new SalesPerson("Tucydides"));
        workplace.addEmployee(new OfficeWorker("Publius Tacitus", ExperienceLevel.SENIOR));
        workplace.addEmployee(new OfficeWorker("Suetonius", ExperienceLevel.JUNIOR));
        workplace.addEmployee(new OfficeWorker("Dio Cassius", ExperienceLevel.JUNIOR));
        workplace.addEmployee(new GroupLead("Cato The Elder"));
        workplace.addEmployee(new GroupLead("Eric Bloodaxe of Northumbria"));
        System.out.println("Hired some!");

        System.out.println("Setting workgroups..");
        GroupLead groupLead1 = (GroupLead) workplace.getEmployeeByName("Cato The Elder");
        WorkGroup workGroupA = new WorkGroup(groupLead1, GroupType.SALES, "SalesGroupA");

        Employee employee1 =  workplace.getEmployeeByName("Plutarch");
        workGroupA.addMember(employee1);
        Employee employee2 = workplace.getEmployeeByName("Xenophon");
        workGroupA.addMember(employee2);

        GroupLead groupLead2 = (GroupLead) workplace.getEmployeeByName("Eric Bloodaxe of Northumbria");
        WorkGroup workGroupB = new WorkGroup(groupLead2, GroupType.OFFICE, "OfficeGroupB");

        Employee employee3 = workplace.getEmployeeByName("Publius Tacitus");
        workGroupB.addMember(employee3);
        Employee employee4 = workplace.getEmployeeByName("Suetonius");
        workGroupB.addMember(employee4);
        Employee employee5 = workplace.getEmployeeByName("Dio Cassius");
        workGroupB.addMember(employee5);

        workplace.addWorkGroup(workGroupA);
        workplace.addWorkGroup(workGroupB);
        System.out.println("workgroups set!");
        System.out.println("Raise groupLeads salaries for newly created groups");
        for (Employee employee : workplace.getEmployeeList()) {
            if (employee.getEmployeeType() == EmployeeType.GROUPLEAD) {
                GroupLead groupLead = (GroupLead) employee;
                groupLead.raiseSalary();
            }
        }
        System.out.println("salaries raised.");

        System.out.println("Current Employees: ");
        for (Employee employee : workplace.getEmployeeList()) {
            employee.printSalary();
            employee.printGroup();
        }
    }
}
