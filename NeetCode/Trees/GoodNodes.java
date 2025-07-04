package NeetCode.Trees;


public class GoodNodes {
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
    }
    public static int goodNodes(TreeNode root) {
        if(root ==null){
            return 0;
        }
        return dfs(root,root.val);
    }
    public static int dfs(TreeNode root , int maxVal){
        int res = (root.val>= maxVal)? 1 : 0;
        maxVal = Math.max(maxVal, root.val);
        res+=dfs(root.left, maxVal);
        res+=dfs(root.right, maxVal);
        return res;

    }


    public static void main(String[] args) {

    }
}
