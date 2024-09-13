import java.util.ArrayList;

public class productofself {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] ans = productExceptSelf(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] check = new boolean[nums.length];
        int prod = 1;
        int i = 0;
        int j = 0;
        while (i < nums.length) {
            check[i] = true;
            if (check[j] == false) {
                System.out.println("Number taken : " + nums[j]);
                prod = prod * nums[j];
                j++;
            } else if (check[j] == true) {
                System.out.println("Number left : " + nums[j]);
                j++;
            }
            if (j == nums.length) {
                i++;
                j = 0;
                ans.add(prod);
                prod = 1;
            }
        }
        for (int a = 0; a < nums.length; a++) {
            nums[a] = ans.get(a);
        }
        return nums;
    }
}
