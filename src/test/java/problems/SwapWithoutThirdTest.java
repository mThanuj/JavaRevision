package problems;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SwapWithoutThirdTest {

    @Test
    public void test() {
        Object[][] testCases = new Object[][] {
                { new int[] { 1, 2 }, new int[] { 2, 1 } },
                { new int[] { 3, 2 }, new int[] { 2, 3 } },
        };

        for (Object[] objects : testCases) {
            int[] input = (int[]) objects[0];
            int[] output = (int[]) objects[1];


            int[] actual = SwapWithoutThird.solve(input);

            Assert.assertEquals(actual, output);
        }
    }

}
