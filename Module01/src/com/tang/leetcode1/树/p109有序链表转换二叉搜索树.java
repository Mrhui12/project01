package com.tang.leetcode1.树;

@SuppressWarnings("all")
public class p109有序链表转换二叉搜索树 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head==null)return null;
        else  if (head.next==null) return new TreeNode(head.val);
        ListNode slow=head,fast=head,pre=null;
        while (fast!=null&&fast.next!=null){
            pre=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        pre.next=null;
        TreeNode root=new TreeNode(slow.val);
        root.left=sortedListToBST(head);
        root.right=sortedListToBST(slow.next);
        return  root;
    }
}
