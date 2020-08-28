package com.codecool;

import com.codecool.employees.Employee;
import com.codecool.employees.GroupLead;
import com.codecool.employees.OfficeWorker;
import com.codecool.employees.SalesPerson;
import com.codecool.utilities.ExperienceLevel;

/**
 * Project simulation!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println( "Setting office workplace.." );
        OfficeWorkplace officeWorkplace = OfficeWorkplace.getInstance();
        System.out.println("workplace set!");

        System.out.println("Hiring employees..");
        officeWorkplace.addEmployee(new SalesPerson("Plutarch"));
        officeWorkplace.addEmployee(new SalesPerson("Xenophon"));
        officeWorkplace.addEmployee(new SalesPerson("Tucydides"));
        officeWorkplace.addEmployee(new OfficeWorker("Publius Tacitus", ExperienceLevel.SENIOR));
        officeWorkplace.addEmployee(new OfficeWorker("Suetonius", ExperienceLevel.JUNIOR));
        officeWorkplace.addEmployee(new GroupLead("Cato The Elder"));
        System.out.println("Hired some!");

        System.out.println("Current Employees: ");
        for (Employee employee : officeWorkplace.getEmployeeList()) {
            employee.printSalary();
        }
    }
}
