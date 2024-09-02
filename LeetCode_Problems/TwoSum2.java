public class TwoSum2 {
    public static void main(String[] args) {

        int[] nums = { -10, -8, -2, 1, 2, 5, 6 };
        int target = 0;
        twoSum(nums, target);
    }

    // Brute Force approch
    public static int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        int i = 0;
        int j = 1;
        while (i < numbers.length) {
            while (j < numbers.length) {
                if (Integer.sum(numbers[i], numbers[j]) == target) {
                    answer[0] = i + 1;
                    answer[1] = j + 1;
                    break;
                } else {
                    j++;
                }
            }
            i++;
            j = i + 1;
        }
        for (int a = 0; a < answer.length; a++) {
            System.out.println(answer[a]);
        }
        return answer;
    }

    // Optimised Approch
    public static int[] twoSum2(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] { left + 1, right + 1 };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
}
