/* 
283.
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

    Note that you must do this in-place without making a copy of the array.
 */
public class zerostoend {
    public static void main(String[] args) {
        int[] nums = { 0 };
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < nums.length) {
            while (j < nums.length) {
                if (nums[j] != 0) {
                    nums[i] = nums[j];
                    j++;
                    i++;
                    count++;
                } else {
                    j++;
                }
            }
            i++;
        }
        for (int a = count; a < nums.length; a++) {
            nums[a] = 0;
        }
    }
}
