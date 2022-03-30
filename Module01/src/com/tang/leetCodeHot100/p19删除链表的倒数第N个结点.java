package com.tang.leetCodeHot100;

public class p19删除链表的倒数第N个结点 {
    @SuppressWarnings("all")
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode fast = pre, slow = pre;
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return pre.next;
    }
}
/*
删除倒数第N个节点
利用快慢指针
先创建一个空指针pre
让他下一个节点指向head
再让快慢指针等于pre
先让块指针往下传N次
然后快慢指针再一起往上下传
 */