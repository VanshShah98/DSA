import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        System.out.println(longestConsecutive(nums));
    }

    // For all array from 0 to N.
    public static int longestConsecutive(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        List<Boolean> ans = new ArrayList<Boolean>(Arrays.asList(new Boolean[max + 1]));
        Collections.fill(ans, Boolean.TRUE);
        for (int i = 0; i < nums.length; i++) {
            ans.set(nums[i], false);
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
        int total = 0;
        int count = 0;
        for (int i = 0; i < ans.size(); i++) {
            if (ans.get(i) == false) {
                count = count + 1;
            }
            if (i == ans.size() - 1 || ans.get(i) == true) {
                total = Math.max(count, total);
                count = 0;
            }
        }
        return total;
    }
}
