package problems;

public class CheckNumberPalindrome {

    public static boolean solve(int num) {
        int rev = 0;

        int temp = num;

        while (temp > 0) {
            int rem = temp % 10;

            rev = rev * 10 + rem;

            temp /= 10;
        }

        return num == rev;
    }

}
