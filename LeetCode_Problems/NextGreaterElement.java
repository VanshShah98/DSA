
// import java.util.ArrayList;
// import java.util.Deque;
import java.util.ArrayList;
import java.util.Stack;

/**
 * NextGreaterElement
 */
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 2 };
        int[] nums2 = { 1, 3, 4, 2 };
        int[] ans = nextGreaterElement(nums1, nums2);
        for (int a = 0; a < ans.length; a++) {
            System.out.print(ans[a] + " ");
        }
    }

    public static int[] nextGreaterElement(int[] nums2) {
        int n = nums2.length;
        int[] nge = new int[n];
        ArrayList<Integer> ng = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (stack.isEmpty() == false && stack.peek() <= nums2[i % n]) {
                stack.pop();
            }
            if (i < n) {
                if (!stack.isEmpty()) {
                    nge[i] = stack.peek();
                    ng.add(stack.peek());

                } else {
                    nge[i % n] = -1;
                    ng.add(-1);
                }
            }

            stack.push(nums2[i % n]);
        }
        System.out.println(ng);
        return nge;
    }

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int nge[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= nums[i % n]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty() == false)
                    nge[i] = st.peek();
                else
                    nge[i] = -1;
            }

            st.push(nums[i % n]);
        }
        return nge;
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> ng = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() < nums2[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ng.add(-1);
            } else {
                ng.add(stack.peek());
            }
            stack.push(nums2[i]);
        }
        System.out.println(ng);
        return nums1;
    }
}