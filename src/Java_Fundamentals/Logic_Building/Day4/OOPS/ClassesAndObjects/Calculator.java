package Java_Fundamentals.Logic_Building.Day4.OOPS.ClassesAndObjects;

public class Calculator {

    // Static method for integer power
    public static double powerInt(int num1, int num2) {
        return Math.pow(num1, num2);
    }

    // Static method for double power
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    // Main method
    public static void main(String[] args) {

        double intResult = powerInt(2, 3);
        System.out.println("2 to the power of 3 (int): " + intResult);

        double doubleResult = powerDouble(2.5, 2);
        System.out.println("2.5 to the power of 2 (double): " + doubleResult);
    }
}