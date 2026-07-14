package Java_Fundamentals.WrapperClasses;

// Employee class implements Cloneable interface
class Employee implements Cloneable {

    // Data members
    int id;
    String name;
    double salary;

    // Constructor to initialize employee details
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Override clone() method to create a copy of the object
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Method to display employee details
    void display() {
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
    }

    // Main method
    public static void main(String[] args) {

        try {

            // Create the original Employee object
            Employee emp1 = new Employee(101, "Reshmitha", 50000);

            // Clone the original object
            Employee emp2 = (Employee) emp1.clone();

            // Modify the original object
            emp1.name = "Sai";
            emp1.salary = 60000;

            // Display the original object
            System.out.println("Original Employee:");
            emp1.display();

            // Display the cloned object
            System.out.println("\nCloned Employee:");
            emp2.display();

            // Observation
            System.out.println("\nObservation:");
            System.out.println("Changes made to the original object do not affect the cloned object.");

        } catch (CloneNotSupportedException e) {
            System.out.println("Clone operation failed.");
        }
    }
}