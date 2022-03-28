package leetcode.ListNode;

public class p206反转链表 {
    public ListNode reverseList(ListNode head) {
       /* ListNode pre = null, curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = pre;//指向过程
            pre = curr;//更新
            curr = temp;
        }
        return pre;

        */
        if (head == null || head.next == null)//递归结束条件
            return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;//实现反转
        head.next = null;//确保第一个前面为空
        return p;
    }
}