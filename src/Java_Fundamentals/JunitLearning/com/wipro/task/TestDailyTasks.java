package Java_Fundamentals.JunitLearning.com.wipro.task;

import java.util.Arrays;

public class TestDailyTasks {

    public static void main(String[] args) {

        DailyTasks obj = new DailyTasks();

        System.out.println(obj.doStringConcat("Good", "Morning"));

        int[] arr = {4, 2, 7, 1};
        System.out.println(Arrays.toString(obj.sortValues(arr)));

        System.out.println(obj.checkPresence("Java Programming", "Program"));
    }
}