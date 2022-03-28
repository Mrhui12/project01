package leetcode.ListNode;

public class p83删除排序链表中的重复元素 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        ListNode temp = head;

        while (temp.next != null) {
            if (temp.val == temp.next.val)
                temp.next = temp.next.next;
            else temp = temp.next;
        }
        return head;
    }

}
