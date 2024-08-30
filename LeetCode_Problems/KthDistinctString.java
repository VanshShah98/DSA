import java.util.ArrayList;
import java.util.List;

public class KthDistinctString {
    /*
     * A distinct string is a string that is present only once in an array.
     * 
     * Given an array of strings arr, and an integer k, return the kth distinct
     * string present in arr. If there are fewer than k distinct strings, return an
     * empty string "".
     * 
     * Note that the strings are considered in the order in which they appear in the
     * array.
     */
    public static void main(String[] args) {
        String[] str = { "d", "b", "c", "b", "c", "a" };
        String[] str2 = { "a", "b", "a" };
        System.out.println(kthDistinct2(str, 2));
    }

    public static String kthDistinct(String[] arr, int k) {
        String[] answer = new String[arr.length];
        int i = 0;
        int j = 0;
        int count = 0;
        int a = 0;
        while (i < arr.length) {
            while (j < arr.length) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                j++;
            }
            if (count == 1) {
                answer[a] = arr[i];
                a++;
            }
            count = 0;
            j = 0;
            i++;
        }
        return answer[k - 1];
    }

    public static String kthDistinct2(String[] arr, int k) {
        List<String> distinctElements = new ArrayList<>();
        int i = 0;
        int j = 0;
        int count = 0;

        while (i < arr.length) {
            while (j < arr.length) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
                j++;
            }
            if (count == 1) {
                distinctElements.add(arr[i]);
            }
            count = 0;
            j = 0;
            i++;
        }

        if (k - 1 < distinctElements.size()) {
            return distinctElements.get(k - 1);
        } else {
            return "";
        }

    }

}
