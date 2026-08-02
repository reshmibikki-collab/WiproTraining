package Java_Fundamentals.JunitLearning.com.wipro.task;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestCheckPresence {

    @Test
    public void testCheckElementPresence() {

        int[] sortedList = {10, 20, 30, 40};

        boolean isThirtyPresent = checkElementExists(sortedList, 30);
        boolean isFiftyPresent = checkElementExists(sortedList, 50);

        assertTrue(isThirtyPresent,
                "Element 30 should be present in the sorted data.");

        assertFalse(isFiftyPresent,
                "Element 50 should not be present in the sorted data.");
    }

    private boolean checkElementExists(int[] array, int target) {

        for (int num : array) {
            if (num == target) {
                return true;
            }
        }

        return false;
    }
}