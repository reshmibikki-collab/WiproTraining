package Java_Fundamentals.JunitLearning.com.wipro.task;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestSort {

    @Test
    public void testSortValues() {

        DailyTasks obj = new DailyTasks();

        int[] unsortedInput = {5, 2, 8, 1, 3};
        int[] expectedOutput = {1, 2, 3, 5, 8};

        int[] actualOutput = obj.sortValues(unsortedInput);

        assertArrayEquals(expectedOutput, actualOutput,
                "The array was not sorted correctly.");
    }
}