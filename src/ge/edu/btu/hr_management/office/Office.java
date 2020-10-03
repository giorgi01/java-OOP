package ge.edu.btu.hr_management.office;

import ge.edu.btu.hr_management.company.Company;
import ge.edu.btu.hr_management.employee.Employee;

public class Office extends Company {

    private String address;
    private int employeesAmount = 0;
    private final Employee[] employees = new Employee[50];

    public Office(String companyName, String companyIndustry ,String address) {
        super(companyName, companyIndustry);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        this.employees[employeesAmount] = employee;
        this.employeesAmount++;
    }

    public void fireEmployee(Employee employee){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId().equals(employee.getId())) {
                employees[i] = null;
                this.employeesAmount--;
                break;
            }
        }
    }

    public int getEmployeesAmount() {
        return employeesAmount;
    }

    @Override
    public void setCompanyName(String companyName) {
        super.setCompanyName(companyName);
    }

    @Override
    public void setCompanyIndustry(String companyIndustry) {
        super.setCompanyIndustry(companyIndustry);
    }
}
