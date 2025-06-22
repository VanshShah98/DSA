package NeetCode.Trees;


public class invertTree {
    
//   Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 

    public static TreeNode invert_Tree(TreeNode root) {
        if(root==null){
            return null;
        }

        TreeNode left = invert_Tree(root.left);
        TreeNode right= invert_Tree(root.right);

        root.left=right;
        root.right=left;
        return root;
    }

    public static void main(String[] args) {
        
    }
}
