public class Singlenum {
    /*
     * Given a non-empty array of integers nums, every element appears twice except
     * for one. Find that single one.
     * 
     * You must implement a solution with a linear runtime complexity and use only
     * constant extra space.
     */
    public static void main(String[] args) {
        int[] num = { 4, 1, 2, 1, 2 };
        System.out.println(singleNumber(num));
    }

    // Most Optimised form;
    public static int singleNumber(int[] nums) {
        int r = 0;
        for (int num : nums) {
            r ^= num;
        }
        return r;
    }
}
