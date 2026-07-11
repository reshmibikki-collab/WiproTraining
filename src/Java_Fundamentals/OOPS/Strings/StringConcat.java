package Java_Fundamentals.OOPS.Strings;

import java.util.Scanner;

public class StringConcat {

    public static String concatStrings(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if (s1.length() > 0 && s2.length() > 0 &&
            s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            return s1 + s2.substring(1);
        }

        return s1 + s2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        System.out.println("Output: " + concatStrings(s1, s2));

        sc.close();
    }
}