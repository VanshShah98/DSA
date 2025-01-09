package Trees;

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

}
