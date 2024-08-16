package Recurrsion;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        System.out.println("Enter the target: ");
        int target = in.nextInt();
        System.out.println("Index of the target:  " + Binary(target, arr, 0, arr.length - 1));
        in.close();
    }

    // Binary Search is a search algorithm that finds the position of an element in
    // a sorted array. It compares the target value to the middle element of the
    // Sorted Array.
    public static int Binary(int target, int[] arr, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target > arr[mid]) {
            return Binary(target, arr, mid + 1, e);
        } else if (target < arr[mid]) {
            return Binary(target, arr, s, mid - 1);
        } else {
            return mid;
        }

    }
}
