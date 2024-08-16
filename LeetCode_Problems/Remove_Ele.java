import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Ele {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 3 };
        int val = 3;
        Arrays.sort(arr);
        System.out.println(removeElement(arr, val));
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static int removeElement2(int[] nums, int val) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == val) {
                continue;
            } else {
                ans.add(nums[i]);
            }
        }
        System.out.println(ans);
        return ans.size();
    }
}
