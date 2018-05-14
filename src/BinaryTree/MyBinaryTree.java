package BinaryTree;

public class MyBinaryTree {
    BinaryNode root;

    public MyBinaryTree(BinaryNode root) {
        this.root = root;
    }

    public void insertNode(BinaryNode parent, BinaryNode nodeToInsert) {
        parent.addChild(nodeToInsert);
        nodeToInsert.setParent(parent);
    }

    private int heightOfTree(BinaryNode treeRoot) {
        if (treeRoot == null) {
            return 0;
        }
        int leftHeight = heightOfTree(treeRoot.getLeftChild());
        int rightHeight = heightOfTree(treeRoot.getRightChild());
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int getHeight() {
        return heightOfTree(root);
    }

    public static void printPreOrder(BinaryNode node) {
        System.out.print(node.toString());
        if (node.getLeftChild() != null) {
            printPreOrder(node.getLeftChild());
        }
        if (node.getRightChild() != null) {
            printPreOrder(node.getRightChild());
        }
    }

    public static void printInOrder(BinaryNode node) {
        if (node.getLeftChild() != null) {
            printInOrder(node.getLeftChild());
        }
        System.out.print(node.toString());
        if (node.getRightChild() != null) {
            printInOrder(node.getRightChild());
        }
    }

    public static void printPostOrder(BinaryNode node) {
        if (node.getLeftChild() != null) {
            printPostOrder(node.getLeftChild());
        }
        if (node.getRightChild() != null) {
            printPostOrder(node.getRightChild());
        }
        System.out.print(node.toString());
    }
}
