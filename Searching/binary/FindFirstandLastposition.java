import java.util.Scanner;

class FindFirstandLastposition {
    public static void main(String[] args) {// highly imp question.
        Scanner in = new Scanner(System.in);// when deployed on leetcode static is removed.
        int n = in.nextInt();
        int target = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        in.close();
        searchRange(nums, target);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int start = find(nums, target, true);
        int end = find(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;

    }

    public static int find(int[] arr, int target, boolean searchIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (searchIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}