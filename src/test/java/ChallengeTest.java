import com.jlg.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChallengeTest {
    @Test
    public void testChallengeSolution1() {
        int[] arr1 = {2, 7, 11, 15};
        int target1 = 9;
        assertEquals("First index 0 Second index 1", Main.challengeSolution1(arr1, target1));

        int[] arr2 = {3, 2, 4};
        int target2 = 6;
        assertEquals("First index 1 Second index 2", Main.challengeSolution1(arr2, target2));

        int[] arr3 = {1, 2, 3, 4};
        int target3 = 5;
        assertEquals("First index 0 Second index 3", Main.challengeSolution1(arr3, target3));

        int[] arr4 = {};
        int target4 = 0;
        assertEquals("Nothing is found!", Main.challengeSolution1(arr4, target4));

        int[] arr5 = {-1, -2, -3, -4};
        int target5 = -5;
        assertEquals("First index 0 Second index 3", Main.challengeSolution1(arr5, target5));

        int[] arr6 = {1, 2, 3, 4};
        int target6 = 10;
        assertEquals("Nothing is found!", Main.challengeSolution1(arr6, target6));

        int[] arr7 = {1, 2, 3, 4, 5, 6};
        int target7 = 7;
        assertEquals("First index 0 Second index 5", Main.challengeSolution1(arr7, target7));

        int[] arr8 = {1};
        int target8 = 1;
        assertEquals("Nothing is found!", Main.challengeSolution1(arr8, target8));

        int[] arr9 = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        int target9 = Integer.MAX_VALUE + Integer.MAX_VALUE;
        assertEquals("First index 0 Second index 1", Main.challengeSolution1(arr9, target9));

        int[] arr10 = {1, 1, 1, 1};
        int target10 = 2;
        assertEquals("First index 0 Second index 1", Main.challengeSolution1(arr10, target10));
    }

    @Test
    public void testChallengeSolution2(){
        int[] arr1 = {2, 7, 11, 15};
        int target1 = 9;
        assertEquals("First index 0 Second index 1", Main.challengeSolution2(arr1, target1));

        int[] arr2 = {3, 2, 4};
        int target2 = 6;
        assertEquals("First index 1 Second index 2", Main.challengeSolution2(arr2, target2));

        int[] arr3 = {1, 2, 3, 4};
        int target3 = 5;
        assertEquals("First index 0 Second index 3", Main.challengeSolution2(arr3, target3));

        int[] arr4 = {};
        int target4 = 0;
        assertEquals("Nothing is found!", Main.challengeSolution2(arr4, target4));

        int[] arr5 = {-1, -2, -3, -4};
        int target5 = -5;
        assertEquals("First index 0 Second index 3", Main.challengeSolution2(arr5, target5));

        int[] arr6 = {1, 2, 3, 4};
        int target6 = 10;
        assertEquals("Nothing is found!", Main.challengeSolution2(arr6, target6));

        int[] arr7 = {1, 2, 3, 4, 5, 6};
        int target7 = 7;
        assertEquals("First index 0 Second index 5", Main.challengeSolution2(arr7, target7));

        int[] arr8 = {1};
        int target8 = 1;
        assertEquals("Nothing is found!", Main.challengeSolution2(arr8, target8));

        int[] arr9 = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        int target9 = Integer.MAX_VALUE + Integer.MAX_VALUE;
        assertEquals("First index 0 Second index 1", Main.challengeSolution2(arr9, target9));

        int[] arr10 = {1, 1, 1, 1};
        int target10 = 2;
        assertEquals("First index 0 Second index 1", Main.challengeSolution2(arr10, target10));
    }


    // In these tests you can see the particular behaviour of this solution in contrast with
    // the other two where the iteration happens in pair, and not by a nested loop.
    @Test
    public void testChallengeSolution3() {
        int[] arr1 = {2, 7, 11, 15};
        int target1 = 9;
        assertEquals("First index 0 Second index 1", Main.challengeSolution3(arr1, target1));

        int[] arr2 = {3, 2, 4};
        int target2 = 6;
        assertEquals("First index 1 Second index 2", Main.challengeSolution3(arr2, target2));

        int[] arr3 = {1, 2, 3, 4};
        int target3 = 5;
        assertEquals("First index 1 Second index 2", Main.challengeSolution3(arr3, target3));

        int[] arr4 = {};
        int target4 = 0;
        assertEquals("Nothing is found!", Main.challengeSolution3(arr4, target4));

        int[] arr5 = {-1, -2, -3, -4};
        int target5 = -5;
        assertEquals("First index 1 Second index 2", Main.challengeSolution3(arr5, target5));

        int[] arr6 = {1, 2, 3, 4};
        int target6 = 10;
        assertEquals("Nothing is found!", Main.challengeSolution3(arr6, target6));

        int[] arr7 = {1, 2, 3, 4, 5, 6};
        int target7 = 7;
        assertEquals("First index 2 Second index 3", Main.challengeSolution3(arr7, target7));

        int[] arr8 = {1};
        int target8 = 1;
        assertEquals("Nothing is found!", Main.challengeSolution3(arr8, target8));

        int[] arr9 = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        int target9 = Integer.MAX_VALUE + Integer.MAX_VALUE;
        assertEquals("First index 0 Second index 1", Main.challengeSolution3(arr9, target9));

        int[] arr10 = {1, 1, 1, 1};
        int target10 = 2;
        assertEquals("First index 0 Second index 1", Main.challengeSolution3(arr10, target10));
    }
}
