package daily.code.linkedlist;

/**
 * Problem Statement :- Asked By Amazon
 * <p>
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 * <p>
 * Example:
 * <p>
 * Input:
 * [
 * 1->4->5,
 * 1->3->4,
 * 2->6
 * ]
 * Output: 1->1->2->3->4->4->5->6
 * <p>
 * Link :- https://leetcode.com/problems/merge-k-sorted-lists/
 *
 * Also Handling the case of merging to Linked List
 *
 * Link :- https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeKSortedList {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(5);

        ListNode listNode2 = new ListNode(1);
        listNode2.next = new ListNode(3);
        listNode2.next.next = new ListNode(5);

        ListNode listNode3 = new ListNode(2);
        listNode3.next = new ListNode(6);

        ListNode[] listNodes = new ListNode[]{listNode1, listNode2, listNode3};

        ListNode listNode = mergeKLists(listNodes);

        StringBuilder builder = new StringBuilder();
        while (listNode != null) {
            builder.append(listNode.data + "->");
            listNode = listNode.next;
        }
        System.out.println(builder.substring(0,builder.length()-2).toString());
    }

    private static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }

        ListNode head = mergeTwoLists(lists[0], lists[1]);
        for (int count = 2; count < lists.length; count++) {
            head = mergeTwoLists(head, lists[count]);
        }
        return head;

    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode fake = new ListNode(0);
        ListNode p = fake;
        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                ListNode temp = new ListNode(list1.data);
                p.next = temp;
                p = p.next;
                list1 = list1.next;
            } else {
                ListNode temp = new ListNode(list2.data);
                p.next = temp;
                p = p.next;
                list2 = list2.next;
            }
        }
        if (list1 == null) {
            p.next = list2;
        }
        if (list2 == null) {
            p.next = list1;
        }
        return fake.next;
    }

    static class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }
}
