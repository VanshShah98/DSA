package NeetCode.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class RightSideView {
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

    public static List<Integer> rightSideView(TreeNode root) {
        TreeNode initialNode = root;
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        res.add(root.val);
        if (Height(root.right) >= Height(root.left)) {
            while (root.right != null) {
                res.add(root.right.val);
                root = root.right;
            }
        }
        else{
            while (root.right!=null) {
                res.add(root.val);
                root=root.right;
                initialNode=root.left;
            }
            while (initialNode.left != null) {
                res.add(initialNode.val);
                initialNode=initialNode.left;
            }
            
        }

        return res;
    }
        public static List<Integer> rightSideView2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelsize = queue.size();
            TreeNode rightNodes = null;

            for(int i=0;i<levelsize;i++){
                TreeNode curr = queue.poll();
                rightNodes=curr;

                if(curr.left != null) queue.offer(curr.left);
                if(curr.right!=null) queue.offer(curr.right);
            }
            res.add(rightNodes.val);
        }

        return res;
    }
    public static int Height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftH = Height(root.left);
        int rightH = Height(root.right);

        return Math.max(leftH, rightH) + 1;
    }

    public static void main(String[] args) {
        // ✅ First Test Case
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.right = new TreeNode(5);
        root1.right.right = new TreeNode(4);

        System.out.println("Right side view (Test Case 1): " + rightSideView2(root1));

        // ✅ Second Test Case: [1,2,3,4,null,null,null,5]
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.left.left = new TreeNode(5);

        System.out.println("Right side view (Test Case 2): " + rightSideView2(root2));
    }
}