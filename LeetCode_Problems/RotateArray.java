import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2 };
        rotate2(nums, 3);
    }

    public static void rotate(int[] nums, int k) {
        int[] subarray = new int[k];
        subarray = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ans.add(subarray[i]);
        }
        for (int i = 0; i < nums.length - k; i++) {
            ans.add(nums[i]);
        }
        System.out.println(ans);
    }

    public static void rotate2(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int j, last;
            last = nums[nums.length - 1];
            for (j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    public static void rotate3(int[] nums, int k) {
        int n = nums.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int news = i + k;
            while (news >= n) {
                news = news - n;
            }
            arr[news] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }

    }

}
