package NeetCode.Trees;

class MaximumDepth{

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
    static int maxDepth =0;
    public static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        dfs(root, 1);
        return maxDepth;

    }
    public static void dfs(TreeNode root,int depth){
        if(root==null){
            return;
        }
        maxDepth=Math.max(depth,maxDepth);
        dfs(root.left, depth+1);
        dfs(root.right, depth+1);
    }

public static int maxDepth2(TreeNode root) {
    if (root == null) return 0;

    return 1+ Math.max(maxDepth2(root.left), maxDepth2(root.right));
}

public static void dfs2(TreeNode node, int depth) {
    if (node == null) return;

    maxDepth = Math.max(maxDepth, depth);

    dfs2(node.left, depth + 1);
    dfs2(node.right, depth + 1);
}


public static void main(String[] args) {

    // Build the tree:
    //         1
    //        / \
    //       2   3
    //      / \
    //     4   5

    MaximumDepth m = new MaximumDepth();

    // Tree: [3,9,20,null,null,15,7]
    TreeNode root = m.new TreeNode(3);
    root.left = m.new TreeNode(9);
    root.right = m.new TreeNode(20);
    root.right.left = m.new TreeNode(15);
    root.right.right = m.new TreeNode(7);

    int depth = maxDepth2(root);
    System.out.println("Maximum Depth: " + depth);


    MaximumDepth n = new MaximumDepth();

    // Tree: [1, null, 2]
    TreeNode root2 = n.new TreeNode(1);
    root2.right = n.new TreeNode(2);

    int depth2 = maxDepth2(root2);
    System.out.println("Maximum Depth 2: " + depth2);
}
// public static void main(String[] args) {
//   // Should print 3
// }


}