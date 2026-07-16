package Java_Fundamentals.Collections.LambdaExpressions;

interface WordCount {
    int count(String str);
}

public class MyClassWithLambda {

    public static void main(String[] args) {

        WordCount wc = (str) -> {

            if (str.trim().isEmpty()) {
                return 0;
            }

            return str.trim().split("\\s+").length;
        };

        String s = "Welcome to Wipro Java Full Stack";

        System.out.println("Number of words: " + wc.count(s));
    }
}