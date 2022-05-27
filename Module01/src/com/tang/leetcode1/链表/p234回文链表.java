package com.tang.leetcode1.链表;

@SuppressWarnings("all")
public class p234回文链表 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head, fast = head;
        while (fast.next != null || fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverseListnode(slow.next);
        slow = slow.next;
        while (slow != null) {
            if (slow != head) return false;
            slow = slow.next;
            head = head.next;
        }
        return true;
    }

    private ListNode reverseListnode(ListNode next) {
        if (next == null || next.next == null) return next;
        ListNode p = reverseListnode(next.next);
        next.next.next = next;
        next.next = null;//huan
        return p;
    }
}
