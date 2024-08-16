class NumofOnes {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1 };
        System.out.println(singleNumber(nums));

    }

    public static int singleNumber(int[] nums) {
        int r = 0;
        for (int num : nums) {
            int j = r ^= num;
            System.out.println("J " + " " + j);
        }
        return r;
    }
}