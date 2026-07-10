package Java_Fundamentals.OOPS.ClassesAndObjects;

public class Calculator {

    // Static method to calculate power for integers
    public static double powerInt(int num1, int num2) {
        return Math.pow(num1, num2);
    }

    // Static method to calculate power for double
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {

        System.out.println("2 to the power of 3 (int): " + powerInt(2, 3));

        System.out.println("2.5 to the power of 2 (double): " + powerDouble(2.5, 2));
    }
}