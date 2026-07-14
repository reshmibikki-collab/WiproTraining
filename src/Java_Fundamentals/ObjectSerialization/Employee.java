package Java_Fundamentals.ObjectSerialization;

import java.io.Serializable;
import java.util.Date;

// Employee class implements Serializable
public class Employee implements Serializable {

    // Recommended serial version UID
    private static final long serialVersionUID = 1L;

    // Data members
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    // No-argument constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(String name, Date dateOfBirth,
                    String department, String designation,
                    double salary) {

        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for date of birth
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    // Setter for date of birth
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    // Getter for designation
    public String getDesignation() {
        return designation;
    }

    // Setter for designation
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Display employee details
    @Override
    public String toString() {
        return "Employee Details\n" +
               "-------------------------\n" +
               "Name        : " + name + "\n" +
               "Date of Birth : " + dateOfBirth + "\n" +
               "Department  : " + department + "\n" +
               "Designation : " + designation + "\n" +
               "Salary      : " + salary;
    }
}