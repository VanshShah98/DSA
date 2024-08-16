import java.util.Scanner;

class Num_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        getData(nums, n);
        ShowArray(nums, n);
        findPivot(nums);
        System.out.println(Num_Rot(nums));
        sc.close();

    }

    static void getData(int[] nums, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
    }

    static void ShowArray(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
            ;
        }
    }

    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid - 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;

    }

    static int Num_Rot(int[] nums) {
        int Tr = findPivot(nums);
        return Tr + 1;
    }
}