package Java_Fundamentals.Collections.List;

import java.util.ArrayList;

public class NumberList {

    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(10);       // Integer
        numbers.add(20.5);     // Double
        numbers.add(30.45f);   // Float
        numbers.add(100L);     // Long

        System.out.println(numbers);
    }
}