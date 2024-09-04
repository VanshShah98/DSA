/*
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

    Return the running sum of nums.
 */
public class RunningSum {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 10, 1 };
        runningSum2(nums);
    }

    // Space saving solutions beats 91% at space but 7% at time
    public static int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];
        int i = nums.length;
        while (i > 0) {
            int sum = 0;
            int j = 0;
            while (j != i) {
                sum += nums[j];
                j++;
                answer[i - 1] = sum;
            }

            i--;
        }
        return answer;
    }

    // Time saving solution beats 100% at time 0ms solution but beats 15% at space
    public static int[] runningSum2(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = +nums[i - 1] + nums[i];
        }
        return nums;
    }

}
