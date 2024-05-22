package binarySearchTree;

public class Main {
    public static void main(String[] args) {

        binarySearchTree binarySearchTree = new binarySearchTree();
        binarySearchTree.insertRecurCall(21);
        binarySearchTree.insertRecurCall(10);
        binarySearchTree.insertRecurCall(35);
        System.out.println(binarySearchTree.root.right.value);

    }
}
