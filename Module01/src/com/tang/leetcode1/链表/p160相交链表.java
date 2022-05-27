package com.tang.leetcode1.链表;

@SuppressWarnings("all")
public class p160相交链表 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode hui = headA;
        ListNode ling = headB;
        while (hui != ling) {
            hui = hui == null ? headB : hui.next;
            ling = ling == null ? headA : ling.next;
        }
        return hui;
    }
}
