package NeetCode.Trees;

import Trees.Tree;

public class DiameterofTree {
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
    public class TreeInfo{
        int diam;
        int ht;
        TreeInfo (int diam , int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1+ Math.max(height(root.left),height(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
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
