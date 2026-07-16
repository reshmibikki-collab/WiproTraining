package Java_Fundamentals.Collections.LambdaExpressions;

import java.util.ArrayList;

public class PrimeLambda {

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();

        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        a1.add(6);
        a1.add(7);
        a1.add(8);
        a1.add(9);
        a1.add(10);
        a1.add(11);
        a1.add(12);
        a1.add(13);
        a1.add(14);
        a1.add(15);
        a1.add(16);
        a1.add(17);
        a1.add(18);
        a1.add(19);
        a1.add(20);
        a1.add(21);
        a1.add(22);
        a1.add(23);
        a1.add(24);
        a1.add(25);
        a1.add(29);

        System.out.println("Prime Numbers:");

        a1.forEach(n -> {
            boolean prime = true;

            if (n < 2) {
                prime = false;
            }

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(n);
            }
        });
    }
}