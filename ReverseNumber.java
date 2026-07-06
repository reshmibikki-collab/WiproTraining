package Java_Fundamentals.Flow_Control_Statements;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println(reversed);
    }
}
