package Java_Fundamentals.Language_Basics.MiniProject;

public class Project1 {

    public static String getDesignation(char code) {

        switch (code) {
            case 'e':
                return "Engineer";
            case 'c':
                return "Consultant";
            case 'k':
                return "Clerk";
            case 'r':
                return "Receptionist";
            case 'm':
                return "Manager";
            default:
                return "Invalid";
        }
    }

    public static int getDA(char code) {

        switch (code) {
            case 'e':
                return 20000;
            case 'c':
                return 32000;
            case 'k':
                return 12000;
            case 'r':
                return 15000;
            case 'm':
                return 40000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please enter an Employee ID.");
            return;
        }

        int employeeId = Integer.parseInt(args[0]);

        Employee[] employees = {

            new Employee(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000),
            new Employee(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000),
            new Employee(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000),
            new Employee(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000, 2000),
            new Employee(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000),
            new Employee(1006, "Suman", "01/01/2000", 'e', "Manufacturing", 23000, 9000, 4400),
            new Employee(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000)
        };

        Employee selectedEmployee = null;

        for (Employee employee : employees) {

            if (employee.getEmpNo() == employeeId) {
                selectedEmployee = employee;
                break;
            }
        }

        if (selectedEmployee == null) {
            System.out.println("There is no employee with employee id : " + employeeId);
            return;
        }

        String designation = getDesignation(selectedEmployee.getDesignationCode());
        int da = getDA(selectedEmployee.getDesignationCode());

        int salary = selectedEmployee.getBasicSalary()
                + selectedEmployee.getHra()
                + da
                - selectedEmployee.getIncomeTax();

        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-8s %-12s %-15s %-15s %s%n",
                "Emp No", "Emp Name", "Department", "Designation", "Salary");
        System.out.println("---------------------------------------------------------------");

        System.out.printf("%-8d %-12s %-15s %-15s %d%n",
                selectedEmployee.getEmpNo(),
                selectedEmployee.getEmpName(),
                selectedEmployee.getDepartment(),
                designation,
                salary);

        System.out.println("---------------------------------------------------------------");
    }
}