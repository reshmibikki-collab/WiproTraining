package Flow_Control_Statements.Arrays_Statements;

public class AsciiToChar {
    

    public static void main(String[] args) {
        int[] asciiValues = {65, 66, 67, 68, 69}; // A, B, C, D, E

        for (int val : asciiValues) {
            System.out.print((char) val + " ");
        }
    }
}
