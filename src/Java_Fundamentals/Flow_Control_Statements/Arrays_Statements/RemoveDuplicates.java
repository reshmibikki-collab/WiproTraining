package Flow_Control_Statements.Arrays_Statements;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {12, 34, 12, 45, 67, 89};
        Set<Integer> set = new LinkedHashSet<>();

        for (int i : arr) {
            set.add(i);
        }

        System.out.println("O/P: " + set);
    }
}
