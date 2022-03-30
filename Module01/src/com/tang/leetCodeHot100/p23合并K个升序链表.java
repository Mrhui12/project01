package com.tang.leetCodeHot100;

public class p23合并K个升序链表 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = null;
        if (lists.length == 0) return ans;
        for (int i = 0; i < lists.length; i++) {
            ans = mergetwoLists(ans, lists[i]);
        }
        return ans;
    }

    private ListNode mergetwoLists(ListNode ans, ListNode list) {
        if (ans == null || list == null) return ans == null ? list : ans;
        ListNode pre = new ListNode(0);
        if (ans.val > list.val) {
            list.next = mergetwoLists(ans, list.next);
            return list;
        } else {
            ans.next = mergetwoLists(ans.next, list);
            return ans;
        }
    }
}
/*
给两个队列排序的升级版
用一个循环 不断地去排序所有的链表
开始用一个空的去排序 链表第一个 反复的去排
 */