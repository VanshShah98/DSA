import java.util.Arrays;

/**
 * Q287
 * Given an array of integers nums containing n + 1 integers where each integer
 * is in the range [1, n] inclusive.
 * 
 * There is only one repeated number in nums, return this repeated number.
 * 
 * You must solve the problem without modifying the array nums and uses only
 * constant extra space.
 */
public class DuplicateNumber {

    public static void main(String[] args) {
        int[] arr = { 3, 1, 12, 4, 12 };
        System.out.println(findDuplicate2(arr));
    }

    // Brute Force Approch
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return 0;
    }

    // Second Optimized Approch
    public static int findDuplicate2(int[] nums) {
        boolean[] bool = new boolean[nums.length];
        for (int num : nums) {
            if (bool[num]) {
                return num;
            }
            bool[num] = true;
        }
        return 0;
    }

}