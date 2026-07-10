package Java_Fundamentals.OOPS.Inheritance;

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee emp = new Employee(
                "Reshmitha",
                500000,
                2026,
                "NIN12345");

        System.out.println("Name : " + emp.getName());
        System.out.println("Annual Salary : " + emp.getAnnualSalary());
        System.out.println("Year Started : " + emp.getYearStarted());
        System.out.println("NIN : " + emp.getNationalInsuranceNumber());
    }
}