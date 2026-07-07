package Flow_Control_Statements.Arrays_Statements;

public class MaxInArray {
    public static void main(String[] args) {
        // Check if exactly 9 arguments are provided
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }

        int[][] array = new int[3][3];
        int count = 0;
        int max = Integer.MIN_VALUE;

        // Populate the 3x3 array and find the maximum
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = Integer.parseInt(args[count++]);
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        // Print the array
        System.out.println("The given array is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Print the result
        System.out.println("The biggest number in the given array is " + max);
    }
}