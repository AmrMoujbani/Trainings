package binarySearchTree;

public class binarySearchTree {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        Node (int value){
            this.value=value;
        }
    }
    public binarySearchTree (){
        this.root=null;
    }

    void insertRecurCall (int value){
        root = insertRecursive(root, value);
    }
    private Node insertRecursive(Node root, int value){
        if (root==null) {
            root= new Node(value);
        } else if (root.value<value) {
            root.right=insertRecursive(root.right,value);
        } else if (root.value>value) {
            root.left=insertRecursive(root.left,value);
        }
        return root;
    }


}
