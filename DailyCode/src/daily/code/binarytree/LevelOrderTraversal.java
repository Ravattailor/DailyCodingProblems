package daily.code.binarytree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Problem Statement :- Level Order Traversal of Binary Tree
 * <p>
 * Link :- https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
public class LevelOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(40);

        //first child
        root.leftChild = new TreeNode(20);
        root.rightChild = new TreeNode(60);

        //second child
        root.leftChild.leftChild = new TreeNode(10);
        root.leftChild.rightChild = new TreeNode(30);
        root.rightChild.leftChild = new TreeNode(50);
        root.rightChild.rightChild = new TreeNode(70);

        //third child
        root.leftChild.leftChild.rightChild = new TreeNode(12);
        root.rightChild.leftChild.rightChild = new TreeNode(55);

        printLevelOrderTraversal(root);
    }

    //BFS Approach
    private static void printLevelOrderTraversal(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return;
        }

        queue.add(root);

        StringBuilder builder = new StringBuilder();
        while (!queue.isEmpty()) {
            builder.append(queue.peek().data + "->");
            final TreeNode remove = queue.remove();
            if (remove.leftChild != null) {
                queue.add(remove.leftChild);
            }
            if (remove.rightChild != null) {
                queue.add(remove.rightChild);
            }
        }
        System.out.println("Level Order Traversal :- " + builder.substring(0, builder.length() - 2));
    }

    static class TreeNode<T> {
        private T data;
        private TreeNode leftChild;
        private TreeNode rightChild;

        public TreeNode(T data) {
            this.data = data;
        }
    }
}
