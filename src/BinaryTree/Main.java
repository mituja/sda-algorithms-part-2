package BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryNode<String> root = new BinaryNode<>("A");
        BinaryNode<String> rootChild1 = new BinaryNode<>("B");
        BinaryNode<String> rootChild2 = new BinaryNode<>("C");
        BinaryNode<String> rootChild3 = new BinaryNode<>("D");
        BinaryNode<String> bChild1 = new BinaryNode<>("E");
        BinaryNode<String> bChild2 = new BinaryNode<>("F");
        BinaryNode<String> bChild3 = new BinaryNode<>("G");
        BinaryNode<String> dtChild1 = new BinaryNode<>("H");

        MyBinaryTree myBinaryTree = new MyBinaryTree(root);
        myBinaryTree.insertNode(root, rootChild1);
        myBinaryTree.insertNode(root, rootChild2);
        myBinaryTree.insertNode(root, rootChild3);

        myBinaryTree.insertNode(rootChild1, bChild1);
        myBinaryTree.insertNode(rootChild1, bChild2);
        myBinaryTree.insertNode(rootChild1, bChild3);

        myBinaryTree.insertNode(rootChild3, bChild1);

        System.out.println("Height of tree: " + myBinaryTree.getHeight());
        System.out.print("Preorder: ");
        MyBinaryTree.printPreOrder(root);
        System.out.print("\nInorder: ");
        MyBinaryTree.printInOrder(root);
        System.out.print("\nPostorder: ");
        MyBinaryTree.printPostOrder(root);
    }

}
