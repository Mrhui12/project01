package com.tang.leetcode1.妙用数据结构;

@SuppressWarnings("all")
public class p24两两交换链表中的节点 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
/*

 */