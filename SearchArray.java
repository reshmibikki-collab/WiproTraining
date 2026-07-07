package Flow_Control_Statements.Arrays_Statements;

public class SearchArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 34, 56, 7};
        int searchElement = 56; // Change to 90 to test -1 output
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                index = i;
                break;
            }
        }

        System.out.println("Output: " + index);
    }
}