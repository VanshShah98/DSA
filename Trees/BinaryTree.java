package Trees;

import java.util.Scanner;

public class BinaryTree {
    private static class Node {
        int val;
        Node left;
        Node right;

        public Node(int value) {
            this.val = value;
        }
    }

    private static Node root;

    public void populate(Scanner scanner) {
        System.out.println("Enter the value that needs to go in the tree");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter the left of : " + node.val);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the valuse to the left of " + node.val);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);

        }
        System.out.println("Do you want to enter the right of : " + node.val);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the valuse to the right of " + node.val);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.gooddisplay();

    }

    // public void display() {
    //     display(root, " ");
    // }

    // private void display(Node node, String indent) {
    //     if (node == null) {
    //         return;
    //     }
    //     System.out.println(indent + node.val);
    //     display(node.left, indent + "\t");
    //     display(node.right, indent + "\t");
    // }

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
            System.out.println("|---------->"+node.val);
        }
        else{
            System.out.println(node.val);
        }
        gooddisplay(node.left, level+1);
    }

}
