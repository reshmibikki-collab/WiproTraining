package Flow_Control_Statements.Arrays_Statements;

import java.util.Arrays;

public class WithoutTen {

    public static int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int pos = 0;

        for (int n : nums) {
            if (n != 10) {
                result[pos] = n;
                pos++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 10, 10, 2};

        int[] result = withoutTen(nums);

        System.out.println(Arrays.toString(result));
    }
}
    

