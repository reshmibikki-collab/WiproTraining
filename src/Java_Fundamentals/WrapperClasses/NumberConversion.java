package Java_Fundamentals.WrapperClasses;

// Program to convert a decimal number into
// Binary, Octal, and Hexadecimal using Wrapper class methods.
public class NumberConversion {

    // Main method
    public static void main(String[] args) {

        // Check whether exactly one command-line argument is provided
        if (args.length != 1) {
            System.out.println("Usage: java NumberConversion <integer>");
            return;
        }

        try {
            // Convert command-line argument to integer
            int number = Integer.parseInt(args[0]);

            // Display the given number
            System.out.println("Given Number : " + number);

            // Display binary equivalent
            System.out.println("Binary equivalent : "
                    + Integer.toBinaryString(number));

            // Display octal equivalent
            System.out.println("Octal equivalent : "
                    + Integer.toOctalString(number));

            // Display hexadecimal equivalent in uppercase
            System.out.println("Hexadecimal equivalent : "
                    + Integer.toHexString(number).toUpperCase());

        } catch (NumberFormatException e) {
            // Handle invalid integer input
            System.out.println("Please enter a valid integer.");
        }
    }
}
