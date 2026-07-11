package Java_Fundamentals.OOPS.Strings;

import java.util.Scanner;

public class MiddleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (input.length() > 2) {
            String result = input.substring(1, input.length() - 1);
            System.out.println("Output: " + result);
        } else {
            System.out.println("Output: null");
        }

        sc.close();
    }
}