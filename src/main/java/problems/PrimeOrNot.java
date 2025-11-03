package problems;

public class PrimeOrNot {

    public static boolean solve(int n) {

        int count = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int left = i;
                int right = n / i;

                if (left == right) {
                    count += 1;
                } else {
                    count += 1; // left
                    count += 1; // right
                }
            }
        }

        return count == 2;

    }

}
