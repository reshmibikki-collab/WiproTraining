package Flow_Control_Statements.Arrays_Statements;


import java.util.Arrays;


public class ArrayExtremes {
    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 89};

        Arrays.sort(arr);

        System.out.println("Smallest 2: " + arr[0] + ", " + arr[1]);
        System.out.println("Largest 2: " + arr[arr.length - 1] + ", " + arr[arr.length - 2]);
    }
}
