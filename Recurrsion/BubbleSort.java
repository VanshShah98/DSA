package Recurrsion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1, 0 };
        // System.out.println();
        Sort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    // Bubble Sort Algorithm
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void Sort(int arr[], int r, int index) {
        if (r == 0) {
            return;
        }
        if (index < r) {
            if (arr[index] > arr[index + 1]) {
                swap(arr, index, index + 1);

            }
            Sort(arr, r, index + 1);
        } else {
            Sort(arr, r - 1, 0);
        }
    }
}
