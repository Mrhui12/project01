package leetcode.ListNode;



public class p234回文链表 {
    public boolean isPalindrome(ListNode head) {
        if (head==null||head.next==null)
            return  true;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {//两次都是用fast去除奇偶数
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reversListNode(slow.next);//用slow.next 作为头结点来反转后半部分的链表
        slow = slow.next;
        while (slow != null) {
            if (slow.val != head.val) return false;//是val的比较
            else {
                slow = slow.next;
                head = head.next;
            }
        }
        return true;
    }

    private ListNode reversListNode(ListNode slow) {
        ListNode pre = null, temp;
        while (slow != null) {
            temp = slow.next;
            slow.next = pre;
            pre = slow;
            slow = temp;
        }
        return pre;
    }

}
