package Java_Fundamentals.IOOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// Program to copy the contents of one file into another file
public class FileCopy {

    // Main method
    public static void main(String[] args) {

        // Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Read input file name
        System.out.print("Enter the input file name: ");
        String inputFile = sc.nextLine();

        // Read output file name
        System.out.print("Enter the output file name: ");
        String outputFile = sc.nextLine();

        try {

            // Open the input file
            FileInputStream fis = new FileInputStream(inputFile);

            // Create/Open the output file
            FileOutputStream fos = new FileOutputStream(outputFile);

            int data;

            // Read one byte at a time and write it to the output file
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            // Close both streams
            fis.close();
            fos.close();

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Close scanner
        sc.close();
    }
}