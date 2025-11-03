package problems;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeOrNotTest {

    @Test
    public void test() {
        Object[][] testCases = new Object[][] {
                { 16, false },
                { 5, true },
                { 9, false },
                { 29, true },
        };

        for (Object[] objects : testCases) {
            int input = (int) objects[0];
            boolean output = (boolean) objects[1];

            boolean actual = PrimeOrNot.solve(input);

            Assert.assertEquals(actual, output);
        }
    }

}
