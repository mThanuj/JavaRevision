package problems;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckStringPalindromeTest {

    @Test
    public void test() {
        Object[][] testCases = new Object[][] {
                { "acbca", true },
                { "123", false },
        };

        for (Object[] objects : testCases) {
            String input = (String) objects[0];
            boolean output = (boolean) objects[1];

            boolean actual = CheckStringPalindrome.solve(input);

            Assert.assertEquals(actual, output);
        }
    }

}
