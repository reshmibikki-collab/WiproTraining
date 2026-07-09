package Java_Fundamentals.Logic_Building.Day4;

public class LastDigit {

    public static int lastDigit(int input) {
        return Math.abs(input % 10);
    }

    public static void main(String[] args) {
        System.out.println(lastDigit(-197));
    }
}