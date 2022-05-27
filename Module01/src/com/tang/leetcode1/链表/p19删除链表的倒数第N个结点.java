package com.tang.leetcode1.链表;

@SuppressWarnings("all")
public class p19删除链表的倒数第N个结点 {
    ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        ListNode fast = pre, slow = pre;
        pre.next = head;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return pre.next;
    }
}
