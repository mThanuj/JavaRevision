package problems;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciNthTest {

    @Test
    public void test() {
        Object[][] testCases = new Object[][] {
                { 3, 1 },
                { 5, 3 },
        };

        for (Object[] objects : testCases) {
            int input = (int) objects[0];
            int output = (int) objects[1];

            int actual = FibonacciNth.solve(input);

            Assert.assertEquals(actual, output);
        }
    }

}
