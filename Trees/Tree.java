package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx =-1;
        public Node buildTree(int nodes []){
            idx++;
            if(idx >= nodes.length||nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;

        }
    }

    public static void preOrder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data  + " ");
        preOrder(root.left);
        preOrder(root.right);
    }    
    public static void InOrder(Node root){
        if(root==null){
            return ;
        }
        InOrder(root.left);
        System.out.print(root.data  + " ");
        InOrder(root.right);
    }
    public static void PostOrder(Node root){
        if(root==null){
            return ;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data  + " ");
    }
    public static void LOP(Node root) {
        if (root == null) {
            return;
        }
    
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);  // Marker for end of level
    
        while (!queue.isEmpty()) {
            Node curr = queue.remove();
            if (curr == null) {
                System.out.println();
                if (queue.isEmpty()) {
                    break;
                }
                else{
                    queue.add(null);
                }
            } else {
                System.out.print(curr.data + " "); // Add space between node values
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
    }
    public static int countNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes=countNodes(root.left);
        int rightNodes=countNodes(root.right);

        return leftNodes+rightNodes+1;
    }
    public static int Sum(Node root, int sum){
        if(root==null){
            return 0;
        }
        int leftNodes = Sum(root.left, sum+root.data);
        int rightNodes=Sum(root.right, sum+root.data);
         return leftNodes+rightNodes+root.data;
    }
    public static int Sum(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes = Sum(root.left);
        int rightNodes=Sum(root.right);
         return leftNodes+rightNodes+root.data;
    }
    public static int Height(Node root){
        if(root==null){
            return 0;
        }
        int leftH=Height(root.left);
        int rightH=Height(root.right);
        
        return Math.max(leftH, rightH)+1;
    }
    public static int Diameter(Node root){
        if(root==null){
            return 0;
        }
        int diam1= Diameter(root.left);
        int diam2 = Diameter(root.right);
        int diam3 =  Height(root.left)+Height(root.right)+1;
        return Math.max(Math.max(diam2, diam1), diam3);
    }
    public static void main(String[] args) {
        int [] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree BST = new BinaryTree();
        Node root =  BST.buildTree(nodes);
        // System.out.println(root.data);
        // LOP(root);
        System.out.println(Diameter(root));
    }
}
