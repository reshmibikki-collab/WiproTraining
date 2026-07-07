package Java_Fundamentals.Flow_Control_Statements;

public class CharacterType {
    public static void main(String[] args) {
        char value = args[0].charAt(0);

        if ((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z')) {
            System.out.println("Alphabet");
        } else if (value >= '0' && value <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
