package easy;

import util.ListNode;

/*
206. Reverse Linked List
https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next;
        while (head != null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
