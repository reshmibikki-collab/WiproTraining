package Flow_Control_Statements.Arrays_Statements;

public class Sum67 {
    


    public static int sum67(int[] nums) {
        int sum = 0;
        boolean ignore = false;

        for (int n : nums) {
            if (n == 6) {
                ignore = true;
            }

            if (!ignore) {
                sum += n;
            }

            if (n == 7 && ignore) {
                ignore = false;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 6, 99, 99, 7};

        System.out.println("Sum = " + sum67(nums));
    }
}
