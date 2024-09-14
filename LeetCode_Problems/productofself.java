import java.util.ArrayList;

public class productofself {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] ans = productExceptSelf2(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    // O(n^2) Brute force.
    public static int[] productExceptSelf(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] check = new boolean[nums.length];
        int prod = 1;
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            check[i] = true;
            if (check[j] == false) {
                prod = prod * nums[j];
                j++;
            } else if (check[j] == true) {
                j++;
            }
            if (j == nums.length) {
                check[i] = false;
                i++;
                ans.add(prod);
                prod = 1;
                j = 0;
            }
        }
        for (int a = 0; a < nums.length; a++) {
            nums[a] = ans.get(a);
        }
        return nums;
    }

    // Optimized code O(n)
    public static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int rightProd = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProd;
            rightProd *= nums[i];
        }

        return result;
    }

}
