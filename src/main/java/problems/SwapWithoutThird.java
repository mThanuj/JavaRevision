package problems;

public class SwapWithoutThird {

    public static int[] solve(int[] arr) {
        arr[0] = arr[0] + arr[1];
        arr[1] = arr[0] - arr[1];
        arr[0] = arr[0] - arr[1];

        return arr;
    }

}
