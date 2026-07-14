package Java_Fundamentals.WrapperClasses;

import java.util.Scanner;

// Program to display the 8-bit binary representation
// of a number between 1 and 255.
public class BinaryRepresentation {

    // Main method
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Read an integer from the user
        System.out.print("Enter a number (1-255): ");
        int number = sc.nextInt();

        // Check whether the number is in the valid range
        if (number < 1 || number > 255) {
            System.out.println("Please enter a number between 1 and 255.");
        } else {

            // Convert the number to binary
            String binary = Integer.toBinaryString(number);

            // Add leading zeros to make it an 8-bit binary number
            binary = String.format("%8s", binary).replace(' ', '0');

            // Display the binary representation
            System.out.println("Binary representation: " + binary);
        }

        // Close the Scanner object
        sc.close();
    }
}