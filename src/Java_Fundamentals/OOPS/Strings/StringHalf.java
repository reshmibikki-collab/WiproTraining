package Java_Fundamentals.OOPS.Strings;

import java.util.Scanner;

public class StringHalf {

    public static String getFirstHalf(String input) {
        if (input == null || input.length() % 2 != 0) {
            return null;
        }

        return input.substring(0, input.length() / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Output: " + getFirstHalf(input));

        sc.close();
    }
}