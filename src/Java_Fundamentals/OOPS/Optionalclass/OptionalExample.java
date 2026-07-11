package Java_Fundamentals.OOPS.Optionalclass;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        String[] names = new String[5];

        // Wrap the array element in an Optional
        Optional<String> checkName = Optional.ofNullable(names[0]);

        // Get the length if present, otherwise return 0
        int length = checkName.map(String::length).orElse(0);

        System.out.println("Length: " + length);
    }
}