package Flow_Control_Statements.Arrays_Statements;

import java.util.Arrays;

public class EvenOdd {

    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int evenIdx = 0;
        int oddIdx = nums.length - 1;

        for (int n : nums) {
            if (n % 2 == 0) {
                result[evenIdx++] = n;
            } else {
                result[oddIdx--] = n;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 0, 1, 1};

        int[] result = evenOdd(nums);

        System.out.println(Arrays.toString(result));
    }
}