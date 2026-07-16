package Java_Fundamentals.Collections.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Apple");
        ts.add("Banana");
        ts.add("Orange");
        ts.add("Mango");

        // Display in reverse order
        System.out.println("Reverse Order:");
        System.out.println(ts.descendingSet());

        // Display using Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<String> it = ts.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Search elements
        System.out.println("\nContains Mango? " + ts.contains("Mango"));
        System.out.println("Contains Grapes? " + ts.contains("Grapes"));
    }
}