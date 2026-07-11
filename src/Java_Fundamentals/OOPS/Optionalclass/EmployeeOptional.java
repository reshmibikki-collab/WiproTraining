package Java_Fundamentals.OOPS.Optionalclass;

import java.util.Optional;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class InvalidEmployeeException extends RuntimeException {
    InvalidEmployeeException(String message) {
        super(message);
    }
}

public class EmployeeOptional {

    public static void main(String[] args) {

        Employee emp = new Employee(101, "Reshmitha");

        Employee employee = Optional.ofNullable(emp)
                .orElseThrow(() ->
                        new InvalidEmployeeException("Employee is null"));

        System.out.println(employee.name);
    }
}