package daily.code.binarytree;

public class ValidateBinarySearchTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.leftChild = new TreeNode(25);
        root.rightChild = new TreeNode(75);
        root.leftChild.rightChild = new TreeNode(35);
        root.leftChild.leftChild = new TreeNode(20);
        root.rightChild.rightChild = new TreeNode(100);
        root.rightChild.rightChild.rightChild = new TreeNode(99);

        System.out.println("Is Valid Binary Search Tree : " + validateTreeIsBinary(root));
    }

    private static boolean validateTreeIsBinary(TreeNode root) {
        if (root.leftChild != null) {
            if (root.leftChild.data > root.data)
                return false;
            else
                validateTreeIsBinary(root.leftChild);
        }

        if (root.rightChild != null) {
            if (root.rightChild.data < root.data)
                return false;
            else
                validateTreeIsBinary(root.rightChild);
        }


        return true;
    }

    static class TreeNode {
        private int data;
        private TreeNode leftChild;
        private TreeNode rightChild;

        TreeNode(int data) {
            this.data = data;
        }
    }
}
