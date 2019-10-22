package daily.code.binarytree;

/**
 * Problem Statement :- Print All the leaf nodes of binary tree from left to right.
 *
 * Solution :- Recursive approach
 *  recursively moving to left most part and then right most if both left and right child are null then printing the data of leaf node
 */
public class LeafNodesOfBinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(25);
        root.leftChild = new TreeNode(20);
        root.rightChild = new TreeNode(30);

        root.leftChild.leftChild = new TreeNode(15);
        root.leftChild.rightChild = new TreeNode(22);
        root.leftChild.leftChild.leftChild = new TreeNode(5);

        root.rightChild.leftChild = new TreeNode(27);
        root.rightChild.rightChild = new TreeNode(35);
        root.rightChild.rightChild.rightChild = new TreeNode(40);

        printLeafNodes(root);
    }

    private static void printLeafNodes(TreeNode head) {
        if (head.leftChild == null && head.rightChild == null) {
            System.out.println(head.data);
        }
        if(head.leftChild != null){
            printLeafNodes(head.leftChild);
        }
        if(head.rightChild != null){
            printLeafNodes(head.rightChild);
        }
    }

    static class TreeNode {
        private int data;
        private TreeNode leftChild, rightChild;

        TreeNode(int data) {
            this.data = data;
        }
    }
}
