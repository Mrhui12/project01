package com.tang.leetcode1.链表;

@SuppressWarnings("all")
public class p206反转链表 {
    public ListNode reverseList(ListNode head) {
        if (head==null||head.next==null)
            return head;
        ListNode p=reverseList(head.next);
        head.next.next=head;
        head.next=null;//bi mian xunhuan
        return  p;
//        ListNode pre = null;
//        ListNode cur = head;
//        while (cur != null) {
//            ListNode temp = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = temp;
//        }
//        return pre;
    }
}
/*
反转链表
 借助两个 pre cur
 */