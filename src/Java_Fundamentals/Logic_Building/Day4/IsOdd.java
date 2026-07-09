package Java_Fundamentals.Logic_Building.Day4;

public class IsOdd {

    public static int isOdd(int input) {
        if (input % 2 != 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println(isOdd(15));
    }
}