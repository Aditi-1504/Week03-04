import java.util.*;

public class Problem5{

    public static int linearFirst(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) return i;
        }
        return -1;
    }

    public static int linearLast(String[] arr, String target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals(target)) return i;
        }
        return -1;
    }

    public static int binarySearch(String[] arr, String target) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m].equals(target)) return m;
            else if (arr[m].compareTo(target) < 0) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    public static int count(String[] arr, String target) {
        int c = 0;
        for (String s : arr) if (s.equals(target)) c++;
        return c;
    }

    public static void main(String[] args) {

        String[] logs = {"accA", "accB", "accB", "accC"};
        Arrays.sort(logs);

        System.out.println(linearFirst(logs, "accB"));
        System.out.println(linearLast(logs, "accB"));
        System.out.println(binarySearch(logs, "accB"));
        System.out.println(count(logs, "accB"));
    }
}