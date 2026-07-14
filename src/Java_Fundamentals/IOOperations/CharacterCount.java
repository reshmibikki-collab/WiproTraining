package Java_Fundamentals.IOOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Program to count the number of occurrences of a character in a file
public class CharacterCount {

    // Main method
    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Read file name from the user
        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();

        // Read the character to be counted
        System.out.print("Enter the character to be counted: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));

        // Variable to store character count
        int count = 0;

        try {

            // Open the file
            Scanner fileScanner = new Scanner(new File(fileName));

            // Read the file line by line
            while (fileScanner.hasNextLine()) {

                // Convert line to lowercase for case-insensitive comparison
                String line = fileScanner.nextLine().toLowerCase();

                // Check each character in the line
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == ch) {
                        count++;
                    }
                }
            }

            // Close the file scanner
            fileScanner.close();

            // Display the result
            System.out.println("File '" + fileName + "' has " + count
                    + " instances of letter '" + ch + "'.");

        }
        // Handle file not found exception
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        // Close the keyboard scanner
        sc.close();
    }
}