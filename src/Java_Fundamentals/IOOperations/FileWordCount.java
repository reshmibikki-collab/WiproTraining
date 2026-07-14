package Java_Fundamentals.IOOperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

// Program to count the frequency of each word in a file
// and write the result into another file.
public class FileWordCount {

    // Main method
    public static void main(String[] args) {

        // Check whether two command-line arguments are provided
        if (args.length != 2) {
            System.out.println("Usage: java FileWordCount <inputFile> <outputFile>");
            return;
        }

        // Input and output file names
        String inputFile = args[0];
        String outputFile = args[1];

        // TreeMap stores words in alphabetical order
        TreeMap<String, Integer> wordMap = new TreeMap<>();

        try {

            // Read the input file
            Scanner fileScanner = new Scanner(new File(inputFile));

            // Read each line
            while (fileScanner.hasNextLine()) {

                String line = fileScanner.nextLine().toLowerCase();

                // Remove punctuation
                line = line.replaceAll("[^a-zA-Z0-9 ]", "");

                // Split line into words
                String[] words = line.split("\\s+");

                // Count word frequency
                for (String word : words) {

                    if (!word.isEmpty()) {

                        if (wordMap.containsKey(word)) {
                            wordMap.put(word, wordMap.get(word) + 1);
                        } else {
                            wordMap.put(word, 1);
                        }
                    }
                }
            }

            fileScanner.close();

            // Write results to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
                writer.write(entry.getKey() + " : " + entry.getValue());
                writer.newLine();
            }

            writer.close();

            System.out.println("Word count written successfully to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}