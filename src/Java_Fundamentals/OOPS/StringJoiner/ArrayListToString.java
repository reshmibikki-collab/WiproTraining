package Java_Fundamentals.OOPS.StringJoiner;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class ArrayListToString {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        StringJoiner sj = new StringJoiner(",", "{", "}");

        for (String name : names) {
            sj.add(name);
        }

        System.out.println("Output: " + sj.toString());
    }
}