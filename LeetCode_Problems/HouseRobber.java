import java.util.Arrays;

public class HouseRobber {
    /*
     * You are a professional robber planning to rob houses along a street. Each
     * house has a certain amount of money stashed, the only constraint stopping you
     * from robbing each of them is that adjacent houses have security systems
     * connected and it will automatically contact the police if two adjacent houses
     * were broken into on the same night.
     * 
     * Given an integer array nums representing the amount of money of each house,
     * return the maximum amount of money you can rob tonight without alerting the
     * police.
     */
    public static void main(String[] args) {
        int[] nums = { 2, 1, 1, 2 };
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int p1 = 0;
        int p2 = 0;

        for (int num : nums) {
            int temp = p1;
            p1 = Math.max(p1, p2 + num);
            p2 = temp;
        }

        return p1;
    }

}
