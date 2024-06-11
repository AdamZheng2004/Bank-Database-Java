package employee_package;

import java.time.*;

public class Employee {
    int employeeId = 0;
    int age = 0;
    String name = "";
    String title = "";
    int branchNumber = 0;
    LocalDate hireDate = LocalDate.of(1980, 1, 1);
    
    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Title: " + title);
        System.out.println("Branch Number: " + branchNumber);
        System.out.println("Hire Date: " + hireDate);
    }// method displayInfo
}// Class Employee
