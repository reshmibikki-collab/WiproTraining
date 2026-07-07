package Flow_Control_Statements.Arrays_Statements;

public class ReverseArray {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers");
            return;
        }

        int[][] matrix = new int[2][2];
        int k = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = Integer.parseInt(args[k++]);
            }
        }

        System.out.println("The reverse of the array is :");

        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    