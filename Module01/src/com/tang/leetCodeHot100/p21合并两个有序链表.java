package com.tang.leetCodeHot100;

public class p21合并两个有序链表 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val > l2.val) {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        } else {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
    }
}
/*
使用递归来完成
先判断两个两边是否有null 有就返回另一个链表
然后判断两个链表头结点的值
如果小的话就往下移动一个
递归 下移动一个的和另一个大的
并且返回小的链表
 */