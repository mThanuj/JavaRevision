package problems;

public class CheckStringPalindrome {

    public static boolean solve(String string) {
        int l = 0, r = string.length() - 1;

        while (l < r) {

            if (string.charAt(l) != string.charAt(r)) {
                return false;
            }

            l++;
            r--;

        }

        return true;
    }

}
