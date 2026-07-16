
    
package Java_Fundamentals.Collections.LambdaExpressions;

import java.util.ArrayList;

public class OddLengthLambda {

    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<>();

        a1.add("Apple");
        a1.add("Banana");
        a1.add("Orange");
        a1.add("Mango");
        a1.add("Kiwi");
        a1.add("Cat");
        a1.add("Dog");
        a1.add("Elephant");
        a1.add("Ball");
        a1.add("Sun");

        System.out.println("Strings with Odd Length:");

        a1.forEach(str -> {
            if (str.length() % 2 != 0) {
                System.out.println(str);
            }
        });
    }
}
