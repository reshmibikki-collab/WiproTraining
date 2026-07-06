package Java_Fundamentals.Flow_Control_Statements;

public class CharOrder {
    public static void main(String[] args) {
        char char1 = args[0].charAt(0);
        char char2 = args[1].charAt(0);

        if (char1 < char2) {
            System.out.println(char1 + ", " + char2);
        } else {
            System.out.println(char2 + ", " + char1);
        }
    }
}