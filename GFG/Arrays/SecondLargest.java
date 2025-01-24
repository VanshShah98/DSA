package GFG.Arrays;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 10,10,10 };
        System.out.println(getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int i = arr.length-1;
        while (i>0) {
            if (arr[i] == arr[i - 1]) {
                i--;
            } else {
                return arr[i-1];
            }
        }
        return -1;
    }
}
