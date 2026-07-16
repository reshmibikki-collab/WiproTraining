package Java_Fundamentals.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    // Constructor
    Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    // Display employee details
    void getEmployeeDetails() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Email         : " + email);
        System.out.println("Gender        : " + gender);
        System.out.println("Salary        : " + salary);
    }
}

class EmployeeDB {

    ArrayList<Employee> list = new ArrayList<>();

    // Add employee
    boolean addEmployee(Employee e) {
        return list.add(e);
    }

    // Delete employee by ID
    boolean deleteEmployee(int empId) {
        Iterator<Employee> iterator = list.iterator();

        while (iterator.hasNext()) {
            Employee e = iterator.next();
            if (e.empId == empId) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    // Display payslip
    String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return "Pay Slip\n"
                        + "Employee ID   : " + e.empId
                        + "\nEmployee Name : " + e.empName
                        + "\nSalary        : " + e.salary;
            }
        }
        return "Employee not found";
    }
}

public class TestEmployee {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(
                101,
                "Sajid",
                "sajid@gmail.com",
                "Male",
                45000
        );

        Employee e2 = new Employee(
                102,
                "Reshmitha",
                "reshmi@gmail.com",
                "Female",
                55000
        );

        // Add employees
        db.addEmployee(e1);
        db.addEmployee(e2);

        // Display employee details
        System.out.println("===== Employee Details =====");
        e1.getEmployeeDetails();

        // Show payslip
        System.out.println("\n===== Pay Slip =====");
        System.out.println(db.showPaySlip(101));

        // Delete employee
        System.out.println("\n===== Delete Employee =====");
        if (db.deleteEmployee(101)) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }

        // Check after deletion
        System.out.println("\n===== After Deletion =====");
        System.out.println(db.showPaySlip(101));
    }
}