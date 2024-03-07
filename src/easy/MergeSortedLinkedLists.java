package easy;

import util.ListNode;

/*
21. Merge Two Sorted Lists
https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeSortedLinkedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode listNode = new ListNode(-1);
        ListNode current = listNode;
        while (list1 != null && list2 != null) {
            int val1 = list1.val;
            int val2 = list2.val;
            if (val1 < val2) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 != null) {
            listNode.next = list1;
        }
        if (list2 != null) {
            listNode.next = list2;
        }
        return listNode.next;
    }

}
