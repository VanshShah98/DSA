import java.util.ArrayList;

class RearrangeEle {
    /*
     * You are given a 0-indexed integer array nums of even length consisting of an
     * equal number of positive and negative integers.
     * 
     * You should return the array of nums such that the the array follows the given
     * conditions:
     * 
     * Every consecutive pair of integers have opposite signs.
     * For all integers with the same sign, the order in which they were present in
     * nums is preserved.
     * The rearranged array begins with a positive integer.
     * Return the modified array after rearranging the elements to satisfy the
     * aforementioned conditions.
     */
    public static void main(String[] args) {
        int[] nums = { -1, 1 };
        rearrangeArray2(nums);
    }

    // Brute Force
    public static int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        int p = 0;
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positive.add(nums[i]);
            } else {
                negative.add(nums[i]);
            }
        }
        System.out.println(positive);
        System.out.println(negative);
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = positive.get(p);
                p++;
            } else {
                nums[i] = negative.get(n);
                n++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        return nums;
    }

    // Optimized
    public static int[] rearrangeArray2(int[] nums) {
        int[] ans = new int[nums.length];
        int pv = 0;
        int nv = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[pv] = nums[i];
                pv = pv + 2;
            } else {
                ans[nv] = nums[i];
                nv = nv + 2;
            }
        }
        return ans;
    }

}