

public class FindSingle {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2 };
        System.out.print(singleNonDuplicate(nums));

    }

    public static int singleNonDuplicate(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}
