package NeetCode.Trees;

public class ValidBST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public static boolean isValidBST(TreeNode root) {
            return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }

        public static boolean check(TreeNode root, long left, long right) {
            if (root == null) {
                return true;
            }
            if (!(left < root.val && root.val < right)) {
                return false;
            }
            return check(root.left, left, root.val) && check(root.right, root.val, right);
        }

        public static void main(String[] args) {
            // ValidBST validator = new ValidBST();

            // Test Case 1: Valid BST
            TreeNode root1 = new TreeNode(2);
            root1.left = new TreeNode(1);
            root1.right = new TreeNode(3);
            System.out.println("Is Valid BST (Test 1): " + isValidBST(root1)); // true

            // Test Case 2: Invalid BST
            TreeNode root2 = new TreeNode(5);
            root2.left = new TreeNode(1);
            root2.right = new TreeNode(4);
            root2.right.left = new TreeNode(3);
            root2.right.right = new TreeNode(6);
            System.out.println("Is Valid BST (Test 2): " + isValidBST(root2)); // false
        }
    }
}
