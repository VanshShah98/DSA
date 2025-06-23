package NeetCode.Trees;

class LCA {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // while (root != null) {
        // if (p.val < root.val && q.val < root.val) {
        // root = root.left;
        // } else if (p.val > root.val && q.val > root.val) {
        // root = root.right;
        // } else {
        // return root;
        // }
        // }
        // return null;

        // with recursion
        if (root == null) {
            return null;
        }
        if (p.val < root.val && q.val < root.val) {
            root = lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            root = lowestCommonAncestor(root.right, p, q);
        } 
        return root;
        

    }

    public static void main(String[] args) {

    }
}