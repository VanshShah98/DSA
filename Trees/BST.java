package Trees;

import java.util.Arrays;

public class BST {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;
        public Node(int value){
            this.value =value;
        }
        public int getValue(){
            return value;
        }
    }
    private Node root;
    public BST(){

    }
    public int getheight(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root==null;
    }

    private void gooddisplay(){
        gooddisplay(root, 0);
    }

    private void gooddisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        gooddisplay(node.right , level+1);
        if(level != 0){
            for(int i=0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|---------->"+node.getValue());
        }
        else{
            System.out.println(node.getValue());
        }
        gooddisplay(node.left, level+1);
    }
    public void insert(int value){
        root=insert(value,root);
    }
    public Node insert(int value,Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(node.value > value){
            node.left = insert(value,node.left);
        }
        if(node.value < value){
            node.right = insert(value,node.right);
        }
        node.height = Math.max(getheight(node.left), getheight(node.right))+1;
        return node;
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(getheight(node.left)-getheight(node.right))<=1 && balanced(node.left)&& balanced(node.right);
    }
    public void populatedSorted(int[] nums){
        populatedSorted(nums, 0, nums.length);
    }
    public void populatedSorted(int [] nums , int start , int end){
        if(start>=end){
            return;
        }
        int mid = (start+end)/2;
        this.insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid+1, end);
    }
    public void populate(int [] nums ){
        for(int i=0;i<nums.length;i++){
            this.insert(nums[i]);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = {5,8 ,1,10,11,19,16,18,14};
        tree.populatedSorted(nums);
        tree.gooddisplay();
        Arrays.sort(nums);
        tree.populatedSorted(nums);
        System.out.println("PreOrder");
        tree.preOrder();
        System.out.println("InOrder");
        tree.inOrder();
        System.out.println("PostOrder");
        tree.postOrder();
        //tree.gooddisplay();
    }
    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.println(node.value + "    ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.value + "    ");
        inOrder(node.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    public void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + "    ");
    }
}   
