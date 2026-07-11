package Java_Fundamentals.OOPS.Strings;

import java.util.Scanner;
import java.util.StringJoiner;

public class RepeatLastN {

    public static String repeatLastN(String str, int n) {

        if (n == 0) {
            return "";
        }

        String lastN = str.substring(str.length() - n);

        StringJoiner sj = new StringJoiner("");

        for (int i = 0; i < n; i++) {
            sj.add(lastN);
        }

        return sj.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        System.out.println("Output: " + repeatLastN(str, n));

        sc.close();
    }
}