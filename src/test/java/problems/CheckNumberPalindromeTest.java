package problems;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckNumberPalindromeTest {

    @Test
    public void test() {
        Object[][] testCases = new Object[][] {
                { 121, true },
                { 123, false },
        };

        for (Object[] objects : testCases) {
            int input = (int) objects[0];
            boolean output = (boolean) objects[1];


            boolean actual = CheckNumberPalindrome.solve(input);

            Assert.assertEquals(actual, output);
        }
    }

}
