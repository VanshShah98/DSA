package GFG.Arrays;

import java.util.Arrays;

public class MoveAllZeors {
    public static void main(String[] args) {
        int [] arr={1, 2, 0, 4, 3, 0, 5, 0};
        pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int nonZeroIndex = 0;
    
        // Move non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }
    
        // Fill the remaining positions with zeros
        for (int i = nonZeroIndex; i < n; i++) {
            arr[i] = 0;
        }
    }
    
}
