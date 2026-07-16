package Java_Fundamentals.Collections.List.LinkedList;

import java.util.LinkedList;

public class EmployeeLinkedList {

    public static void main(String[] args) {

        LinkedList<Employee> list = new LinkedList<>();

        // Add employees
        list.add(new Employee(101, "Sajid", 45000));
        list.add(new Employee(102, "Reshmitha", 50000));

        // Display employees
        System.out.println("===== Employee Details =====");

        for (Employee e : list) {
            System.out.println("Employee ID   : " + e.empId);
            System.out.println("Employee Name : " + e.empName);
            System.out.println("Salary        : " + e.salary);
            System.out.println();
        }
    }
}