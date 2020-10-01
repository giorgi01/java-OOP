package ge.edu.btu.hr_management.employee;

public interface IEmployee {

    String getFirstName();

    String getLastName();

    int getSalary();

    void setSalary(int salary);

    String getPosition();

    void promoteTo(String position);

    void demoteTo(String position);
}
