package Java_Fundamentals.OOPS.Strings;

import java.util.Scanner;

public class MixString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = scanner.nextLine();

        System.out.print("Enter second string: ");
        String b = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        int minLength = Math.min(a.length(), b.length());

        // Interleave characters
        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }

        // Append remaining characters
        if (a.length() > b.length()) {
            result.append(a.substring(minLength));
        } else if (b.length() > a.length()) {
            result.append(b.substring(minLength));
        }

        System.out.println("Output: " + result);

        scanner.close();
    }
}