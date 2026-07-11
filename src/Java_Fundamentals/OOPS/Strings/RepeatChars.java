package Java_Fundamentals.OOPS.Strings;

import java.util.Scanner;

public class RepeatChars {

    public static String repeatFirstTwo(String str) {
        int n = str.length();

        if (n < 2)
            return str.repeat(n);

        String firstTwo = str.substring(0, 2);
        return firstTwo.repeat(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Output: " + repeatFirstTwo(str));

        sc.close();
    }
}