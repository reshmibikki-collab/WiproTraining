package Java_Fundamentals.Collections.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class NegativeEvenNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(-10);
        numbers.add(-7);
        numbers.add(-6);
        numbers.add(5);
        numbers.add(8);
        numbers.add(-4);
        numbers.add(3);
        numbers.add(-2);

        System.out.println("Negative Even Numbers:");

        numbers.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .forEach(System.out::println);
    }
}