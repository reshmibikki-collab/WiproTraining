package Java_Fundamentals.OOPS.Inheritance;

public class TestEmployee {

    public static void main(String[] args) {

        Employee emp = new Employee(
                "Jane Doe",
                55000.0,
                2021,
                "AB123456C");

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Salary: $" + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("Insurance #: " + emp.getNationalInsuranceNumber());
    }
}