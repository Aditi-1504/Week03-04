import java.util.*;

public class Problem6 {

    public static int linear(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static int floor(int[] arr, int target) {
        int l = 0, r = arr.length - 1, res = -1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] <= target) {
                res = arr[m];
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return res;
    }

    public static int ceil(int[] arr, int target) {
        int l = 0, r = arr.length - 1, res = -1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] >= target) {
                res = arr[m];
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] risks = {10, 25, 50, 100};

        System.out.println(linear(risks, 30));
        System.out.println(floor(risks, 30));
        System.out.println(ceil(risks, 30));
    }
}