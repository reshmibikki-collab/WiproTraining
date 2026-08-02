package Java_Fundamentals.JunitLearning.com.wipro.task;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DailyTasksTest {

    DailyTasks obj = new DailyTasks();

    @Test
    public void testDoStringConcat() {
        assertEquals("Hello World", obj.doStringConcat("Hello", "World"));
    }

    @Test
    public void testSortValues() {
        int[] input = {5, 2, 4, 1, 3};
        int[] expected = {1, 2, 3, 4, 5};

        assertArrayEquals(expected, obj.sortValues(input));
    }

    @Test
    public void testCheckPresence() {
        assertTrue(obj.checkPresence("Wipro Technologies", "Tech"));
        assertFalse(obj.checkPresence("Wipro Technologies", "Java"));
    }
}