package leetcode.ListNode;

public class p328奇偶链表 {
    @SuppressWarnings("ALL")
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode evenhead = head.next;
        ListNode odd = head, even = evenhead;
        while (even.next != null && even != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenhead;
        return head;
    }


}
