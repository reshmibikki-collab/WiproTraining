package Java_Fundamentals.Collections.FunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {

    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeSalaryPredicate {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Sajid", 9000));
        list.add(new Employee(102, "Rahul", 18000));
        list.add(new Employee(103, "Anitha", 8500));
        list.add(new Employee(104, "Suman", 25000));
        list.add(new Employee(105, "Ravi", 9500));

        Predicate<Employee> salaryCheck = e -> e.getSalary() < 10000;

        System.out.println("Employees having salary less than 10000:");

        list.stream()
                .filter(salaryCheck)
                .forEach(e -> System.out.println(e.getName()));
    }
}