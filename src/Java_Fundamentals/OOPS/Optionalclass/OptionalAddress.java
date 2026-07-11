package Java_Fundamentals.OOPS.Optionalclass;

import java.util.Optional;

public class OptionalAddress {

    public static void main(String[] args) {

        String address = null;

        String result = Optional.ofNullable(address)
                                .orElse("India");

        System.out.println(result);
    }
}