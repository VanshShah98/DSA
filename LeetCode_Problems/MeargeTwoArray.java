import java.util.Arrays;

/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n. */
public class MeargeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 0, 0, 0 };
        int[] arr2 = { 2, 5, 6 };
        int m = 3, n = 3;
        merge(arr1, m, arr2, n);
        System.out.println(Arrays.toString(arr1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for (int i = 0; i < n; i++) {
            nums1[k] = nums1[i];
            k++;
        }
        for (int j = 0; j < m; j++) {
            nums1[k] = nums2[j];
            k++;
        }

    }
}
