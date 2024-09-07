/**
 * Given an array of integers nums and an integer k, return the total number of
 * subarrays whose sum equals to k.
 * 
 * A subarray is a contiguous non-empty sequence of elements within an array.
 */
public class SubarraywithsumK {
    public static void main(String[] args) {
        int[] nums = { 1, -1, 0 };
        System.out.println(subarraySum(nums, 0));
    }

    // Not the complete solution
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 0 == k) {
                count++;
            }
            if (nums[i] + nums[i + 1] == k) {
                count++;
            } else {
                continue;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        if (nums[nums.length - 1] == k) {
            count++;
        }
        if (sum == k) {
            count++;
        }

        return count;
    }

}