package Java_Fundamentals.ExceptionHandling;

// Main class
public class Person {

    // Main method
    public static void main(String[] args) {

        try {

            // Check whether exactly 2 command-line arguments are provided
            if (args.length != 2) {
                throw new AgeException("Please enter Name and Age.");
            }

            // Read name
            String name = args[0];

            // Convert age from String to Integer
            int age = Integer.parseInt(args[1]);

            // Validate age
            if (age < 18 || age >= 60) {
                throw new AgeException(
                        "Age should be greater than or equal to 18 and less than 60.");
            }

            // Display details if validation is successful
            System.out.println("Name : " + name);
            System.out.println("Age : " + age);

        }
        // Handles invalid integer input
        catch (NumberFormatException e) {
            System.out.println("Age should be a valid integer.");
        }
        // Handles custom AgeException
        catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}