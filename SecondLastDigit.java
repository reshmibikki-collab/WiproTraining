package Java_Fundamentals.Logic_Building.Day4;

public class SecondLastDigit {

    public static int secondLastDigit(int input) {

        input = Math.abs(input);

        if (input < 10)
            return -1;

        return (input / 10) % 10;
    }

    public static void main(String[] args) {
        System.out.println(secondLastDigit(-197));
    }
}