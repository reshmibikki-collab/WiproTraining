


    
package Java_Fundamentals.Collections.Vector;

import java.util.Enumeration;
import java.util.Iterator;
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

public class EmployeeVectorIterator {

    public static void main(String[] args) {

        Vector<Employee> vector = new Vector<>();

        vector.add(new Employee(101, "Sajid", 45000));
        vector.add(new Employee(102, "Reshmitha", 50000));

        System.out.println("===== Using Iterator =====");

        Iterator<Employee> it = vector.iterator();

        while (it.hasNext()) {
            Employee e = it.next();
            System.out.println("Employee ID   : " + e.empId);
            System.out.println("Employee Name : " + e.empName);
            System.out.println("Salary        : " + e.salary);
            System.out.println();
        }

        System.out.println("===== Using Enumeration =====");

        Enumeration<Employee> en = vector.elements();

        while (en.hasMoreElements()) {
            Employee e = en.nextElement();
            System.out.println("Employee ID   : " + e.empId);
            System.out.println("Employee Name : " + e.empName);
            System.out.println("Salary        : " + e.salary);
            System.out.println();
        }
    }
}
