package Java_Fundamentals.Flow_Control_Statements;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        boolean isPrime = num > 1;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}