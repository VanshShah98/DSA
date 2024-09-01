/*
 * You are given an array nums of non-negative integers. nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.

Notice that x does not have to be an element in nums.

Return x if the array is special, otherwise, return -1. It can be proven that if nums is special, the value for x is unique.
 */

class SpecialArray {
    public static void main(String[] args) {
        int[] nums = { 3, 5 };// test case 2
        // int[] nums = {0,4,3,0,4} test case 3
        // int[] nums = {0,0} test case 3
        System.out.println(specialArray(nums));
    }

    public static int specialArray(int[] nums) {
        int x = 0;
        int count = 0;
        int j = 0;
        while (j < nums.length) {
            if (nums[j] >= x) {
                count++;
                j++;
            } else {
                j++;
            }
            if (count > x && j == nums.length) {
                x++;
                count = 0;
                j = 0;
            }

        }
        if (count == x) {
            return x;
        }
        return -1;

    }

    public static void check(int[] nums, int j, int x, int count) {
        while (j < nums.length || count >= x) {
            if (nums[j] >= x) {
                count++;
                j++;
            }
        }
    }
}