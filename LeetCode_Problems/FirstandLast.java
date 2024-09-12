public class FirstandLast {
    /*
     * Given an array of integers nums sorted in non-decreasing order, find the
     * starting and ending position of a given target value.
     * 
     * If target is not found in the array, return [-1, -1].
     * 
     * You must write an algorithm with O(log n) runtime complexity.
     */
    public static void main(String[] args) {
        /*
         * Input: nums = [5,7,7,8,8,10], target = 8
         * Output: [3,4]
         */
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 7;
        int[] ans = searchRange(nums, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + "  ");
        }

    }

    // Brute Force Approch
    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid1 = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                mid1 = mid;
                break;
            }
        }
        if (mid1 == -1) {
            return new int[] { -1, -1 };
        } else {
            int i = mid1;
            int j = mid1;
            for (int a = mid1; a < nums.length; a++) {
                if (nums[a] == nums[mid1]) {
                    j++;
                } else {
                    break;
                }
            }
            for (int a = mid1; a >= 0; a--) {
                if (nums[a] == nums[mid1]) {
                    i--;
                } else {
                    break;
                }
            }

            return new int[] { i + 1, j - 1 };
        }
    }
}
