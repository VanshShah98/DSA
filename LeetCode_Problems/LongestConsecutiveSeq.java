import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSeq{
    public static void main(String[] args) {
        int [] nums = {0,-1};
        System.out.println(longestConsecutive(nums));
    }
    // For all array from 0 to N
    
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        // Use a HashSet to store unique elements
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        int longestStreak = 0;
    
        for (int num : nums) {
            // Check if it's the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
    
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
    
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
    
        return longestStreak;
    }
    
}
