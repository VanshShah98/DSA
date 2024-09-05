//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));

    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check weather the num in even or not
    static boolean even(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        if (count % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    // Easy way to find number of digits
    static int digits(int nums) {
        return (int) (Math.log10(nums)) + 1;
    }

}