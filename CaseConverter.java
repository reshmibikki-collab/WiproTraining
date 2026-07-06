package Java_Fundamentals.Flow_Control_Statements;

public class CaseConverter {
    public static void main(String[] args) {
        char ch = args[0].charAt(0);

        System.out.println("Input: " + ch);

        if (Character.isLowerCase(ch)) {
            System.out.println("Output: " + Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
            System.out.println("Output: " + Character.toLowerCase(ch));
        } else {
            System.out.println("Please enter an alphabet.");
        }
    }
}