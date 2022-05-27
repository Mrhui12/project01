package com.tang.leetcode1.链表;

@SuppressWarnings("ALL")
public class p328奇偶链表 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return head;
        ListNode index = head.next;
        ListNode index1 = head;
        ListNode index2 = index;
        while (index2 != null && index2.next != null) {
            index1.next = index2.next;
            index1 = index1.next;
            index2.next = index1.next;
            index2 = index2.next;
        }
        index1.next = index;
        return head;
    }
}
