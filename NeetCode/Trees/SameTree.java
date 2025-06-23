package NeetCode.Trees;

public class SameTree {
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
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p ==null && q==null){
            return true;
        }
        else if(p != null && q ==null){
            return false;
        }
        else if(p == null && q !=null){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.left, q.right);
    }
    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1+ Math.max(height(root.left),height(root.right));
    }
    public static int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int dia1 = diameterOfBinaryTree(root.left);
        int dia2 = diameterOfBinaryTree(root.right);
        int dia3 = height(root.right)+height(root.left);
        return Math.max(Math.max(dia2, dia3),dia1);
    }
    public static void main(String[] args) {
        
    }
}
