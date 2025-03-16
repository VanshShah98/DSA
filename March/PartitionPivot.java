package March;

import java.util.Arrays;

public class PartitionPivot {
    public static void main(String[] args) {
        int [] nums ={-3,4,3,2};
        nums=pivotArray(nums, 2);
        System.out.println(Arrays.toString(nums));
    }
    public static int[] pivotArray(int[] nums, int pivot) {
        int smallerCount = 0, pivotCount = 0;
        
        // Count elements smaller than pivot and occurrences of pivot
        for (int num : nums) {
            if (num < pivot) smallerCount++;
            else if (num == pivot) pivotCount++;
        }
    
        int[] res = new int[nums.length];
        int i = 0, j = smallerCount, k = smallerCount + pivotCount;
    
        // Distribute numbers in three sections
        for (int num : nums) {
            if (num < pivot) {
                res[i++] = num;
            } else if (num == pivot) {
                res[j++] = num;
            } else {
                res[k++] = num;
            }
        }
    
        return res;
    }
    
}
