package ge.edu.btu.hr_management;

import ge.edu.btu.hr_management.company.Company;
import ge.edu.btu.hr_management.employee.Employee;
import ge.edu.btu.hr_management.office.Office;

import java.util.Arrays;

public class Runner {

        public static void main(String[] args) {
                Company google = new Company();

                Office googleOffice = new Office("Google", "Technologies", "Mountain View");

                Employee employeeFirst = new Employee("Sundar", "Pichai", "CEO", 70000);
                Employee employeeSecond = new Employee("Marcus", "East", "CTO", 50000);

                googleOffice.addEmployee(employeeFirst);
                googleOffice.addEmployee(employeeSecond);

                System.out.println("Mountain View office's employees amount is " + googleOffice.getEmployeesAmount());

                googleOffice.fireEmployee(employeeFirst);

                System.out.println("Mountain View office's employees amount is " + googleOffice.getEmployeesAmount());

                Employee googleEmployee = googleOffice.getEmployees()[1];

                System.out.println(googleEmployee.getFirstName() + " " + googleEmployee.getLastName()
                        + " is " + googleEmployee.getPosition() + " at " + googleOffice.getCompanyName()
                        + ", his salary: " + googleEmployee.getSalary() + "$");

                googleEmployee.demoteTo("Software Engineer");
                googleEmployee.setSalary(12000);

                System.out.println(googleEmployee.getFirstName() + " " + googleEmployee.getLastName()
                        + " now is " + googleEmployee.getPosition() + " at " + googleOffice.getCompanyName()
                        + ", his salary: " + googleEmployee.getSalary() + "$");
        }

}