package ge.edu.btu.hr_management.employee;

import ge.edu.btu.hr_management.customException.IncorrectFormatException;

public class Employee implements IEmployee {

    private String id;
    private String firstName;
    private String lastName;
    private int salary; // in dollars
    private String position;

    public Employee() {}

    public Employee(String id, String firstName, String lastName, String position, int salary) throws IncorrectFormatException {
        if (id.toString().length() < 11) {
            throw new IncorrectFormatException("ID must not be shorter than 11 symbol");
        }
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    @Override
    public String getFirstName(){
        return this.firstName;
    };

    @Override
    public String getLastName(){
        return this.lastName;
    };

    @Override
    public int getSalary(){
        return this.salary;
    }

    @Override
    public void setSalary(int salary){
        this.salary = salary;
    };

    @Override
    public String getPosition(){
        return this.position;
    }

    @Override
    public void promoteTo(String position) throws IncorrectFormatException {
        this.position = position;
    }

    @Override
    public void demoteTo(String position) throws IncorrectFormatException {
        this.position = position;
    }
}