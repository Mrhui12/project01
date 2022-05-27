package com.tang.leetcode1.链表;

import java.util.Arrays;

@SuppressWarnings("all")
public class p148排序链表 {
    public ListNode sortListNode(ListNode head) {
        if (head == null || head.next == null) return head;
        int n = 0;
        ListNode index = head;
        while (index != null) {
            index = index.next;
            n++;
        }
        int[] nums = new int[n];
        ListNode index2 = head;
        for (int i = 0; i < n; i++) {
            nums[i] = index2.val;
            index2 = index2.next;
        }
        Arrays.sort(nums);
        ListNode index3 = head;
        for (int num : nums) {
            index.val = num;
            index3 = index3.next;
        }
        return head;
    }
}
/*
     两种方法
     one  1.count length of ListNode
          create int[n];
          2. for filled arr with ListNode val
          arrays.sort(arr)
          3.change ListNode val by arr;
          return head;
      two  1.  fast and slow get mid
        Listnode temp =slow.next;
        slow.neat=null;
        2. digui
         Listnode left=hanshu(head);
             hanshu(temp);
         3. xin jian
          Listnode h=new Listnode(0);
          Listnode res=h;
          while(l!=null&&r!=null)
          h.next=l;

          h.next=shenxia

          retuen res.neat;
 */