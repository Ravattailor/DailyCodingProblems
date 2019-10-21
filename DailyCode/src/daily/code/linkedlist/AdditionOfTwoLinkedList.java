package daily.code.linkedlist;

/**
 * Problem Statement :- Asked By Microsoft
 * <p>
 * You are given two linked-lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AdditionOfTwoLinkedList {

    public static void main(String[] args) {
        Node firstNode = new Node(2);
        firstNode.next = new Node(4);
        firstNode.next.next = new Node(3);

        Node secondNode = new Node(5);
        secondNode.next = new Node(6);
        secondNode.next.next = new Node(4);

        Node node = addTwoLinkedList(firstNode, secondNode);
        StringBuilder builder = new StringBuilder();
        while (node != null) {
            builder.append(node.data + "->");
            node = node.next;
        }
        System.out.println(builder.substring(0,builder.length()-2));
    }

    public static Node addTwoLinkedList(Node first, Node second) {
        Node fake = new Node(0);
        Node p = fake;

        int carry = 0;
        while (first != null || second != null) {
            int sum = carry;
            if (first != null) {
                sum += first.data;
                first = first.next;
            }

            if (second != null) {
                sum += second.data;
                second = second.next;
            }

            if (sum > 9) {
                carry = 1;
                sum = sum - 10;
            } else {
                carry = 0;
            }

            Node temp = new Node(sum);
            p.next = temp;
            p = p.next;
        }

        if (carry > 0) {
            Node temp = new Node(carry);
            p.next = temp;
        }
        return fake.next;
    }

    public static class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
        }
    }
}
