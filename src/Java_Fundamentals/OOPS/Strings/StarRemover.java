package Java_Fundamentals.OOPS.Strings;

import java.util.Scanner;

public class StarRemover {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '*') {
                continue;
            }

            if (i > 0 && input.charAt(i - 1) == '*') {
                continue;
            }

            if (i < input.length() - 1 && input.charAt(i + 1) == '*') {
                continue;
            }

            result.append(input.charAt(i));
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}