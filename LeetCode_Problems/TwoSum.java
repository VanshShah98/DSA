import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 11, 3 };
        int target = 6;
        System.out.println(Arrays.toString(sol(arr, target)));
    }

    static public int[] sol(int[] arr, int target) {
        int[] ans = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target && i != j) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

}
