package Java_Fundamentals.Collections.Vector;

import java.util.Vector;

class Employee {
    int empId;
    String empName;
    float salary;

    Employee(int empId, String empName, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }
}

public class EmployeeVector {

    public static void main(String[] args) {

        Vector<Employee> list = new Vector<>();

        list.add(new Employee(101, "Sajid", 45000));
        list.add(new Employee(102, "Reshmitha", 50000));

        System.out.println("===== Employee Details =====");

        for (Employee e : list) {
            System.out.println("Employee ID   : " + e.empId);
            System.out.println("Employee Name : " + e.empName);
            System.out.println("Salary        : " + e.salary);
            System.out.println();
        }
    }
}