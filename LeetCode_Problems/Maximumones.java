
class Maximumones {
    /*
     * Given a binary array nums and an integer k,
     * return the maximum number of consecutive 1's in the array if you can flip at
     * most k 0's.
     */
    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
        System.out.println(longestOnes2(nums, 3));
    }

    public static int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int max = 0;
        int[] arr = nums.clone();
        while (i < nums.length) {
            nums = arr.clone();
            int onesleft = k;
            int count = 0;
            while (j < nums.length && onesleft >= 0) {
                if (nums[j] == 1) {
                    j++;
                    count++;
                } else if (nums[j] == 0) {
                    if (onesleft > 0) {
                        nums[j] = 1;
                        onesleft--;
                        count++;
                    }
                    j++;
                }
                if (count > max) {
                    max = count;
                }

            }
            i++;
            j = i;
        }

        return max;
    }

    // most efficent solution
    public static int longestOnes2(int[] nums, int k) {
        int i = 0;
        int max = 0;
        int onesleft = k;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                onesleft--;
            }
            while (onesleft < 0) {
                if (nums[i] == 0) {
                    onesleft++;
                }
                i++;
            }
            max = Math.max(max, j - i + 1);
        }

        return max;
    }

}