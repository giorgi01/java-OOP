package ge.edu.btu.hr_management.employee;

import ge.edu.btu.hr_management.customException.IncorrectFormatException;

public interface IEmployee {

    String getFirstName();

    String getLastName();

    int getSalary();

    void setSalary(int salary);

    String getPosition();

    void promoteTo(String position) throws IncorrectFormatException;

    void demoteTo(String position) throws IncorrectFormatException;
}
