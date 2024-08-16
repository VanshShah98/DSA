class SplitArray {
    public static void main(String[] args) {

    }

    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int p = 1;
            for (int i : nums) {
                if (sum + i > mid) {
                    sum = i;
                    p++;
                } else {
                    sum += i;
                }
            }
            if (p > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}