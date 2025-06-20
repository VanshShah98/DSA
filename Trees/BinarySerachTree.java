package Trees;

import Recurrsion.stringrev;

public class BinarySerachTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root , int val){
        if(root==null){
            root= new Node(val);
            return root;
        }
        if(root.data >val){
            root.left=insert(root.left, val);
        }
       else{
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
        public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
            public static void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data>key){
            return search(root.left, key);
        }
        else if(root.data==key){
            return true;
        }
        else{
            return search(root.right, key);
        }


    }

    public static Node delete(Node root , int val){
        if(root.data>val){
            root.left = delete(root.left, val);
        }
        else if(root.data<val){
            root.right=delete(root.right, val);
        }
        else{
            //case 1 next Node is NUll
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node inorderSuccessor(Node root){
        while (root.left!=null) {
            root=root.left;
        }
        return root;
    }


    //Q Print in Range.
    public static void Print(Node root,int X,int Y){
        if(root==null){
            return;
        }
        if(root.data>=X && root.data<=Y){
            Print(root.left, X, Y);
            System.out.print(root.data + " ");
            Print(root.right, X, Y);
        }
        else if(root.data >= Y){
            Print(root.left, X, Y);
        }
        else{
            Print(root.right, X, Y);
        }
    }
    public static void main(String[] args) {
        int [] values = {5,1,3,4,7,2,10,8,6,9,24,30};
        Node root = null;

        for(int num : values){
            root=insert(root, num);
        }
        inOrder(root);
        System.out.println();
        Print(root, 6, 10);
    }
}
