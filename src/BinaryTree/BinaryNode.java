package BinaryTree;

public class BinaryNode<T> {
    T data;
    BinaryNode parent;
    BinaryNode leftChild;
    BinaryNode rightChild;

    public BinaryNode(T data) {
        this.data = data;
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
    }

    public BinaryNode getLeftChild() {
        return leftChild;
    }

    public BinaryNode getRightChild() {
        return rightChild;
    }

    public BinaryNode getParent() {
        return parent;
    }

    public void setParent(BinaryNode parent) {
        this.parent = parent;
    }

    public void addChild(BinaryNode child) {
        if (leftChild == null) {
            leftChild = child;
        } else if (rightChild == null){
            rightChild = child;
        } else {
            System.out.println("Node " + data + " is full!");
        }
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
