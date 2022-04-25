package com.tang.leetcode1.douleindex;

import java.util.HashSet;

public class p142环形链表II {
    /*  public  ListNode detectCycle(ListNode head){
          ListNode pre=head;
          HashSet<ListNode> listnodes = new HashSet<>();
          while (pre!=null){
              if (listnodes.contains(pre))
                  return pre;
              else listnodes.add(pre);
              pre=pre.next;
          }
          return null;
      }*/
    public ListNode detetCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) break;
        }
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;

    }
}
/*
    两种解法
    1：利用包含法
    一个指针指向head
    放它不为null意向下一个
    如果不包含当前的 指针  推入继续
     如果包含就返回
     出循环就返回null

     2：
     快慢指针
     都指向head
     当fast的不为null 和 fast.next！=null
     fast移动两部 slow移动一步
     直到他们相等 break
     然后fast=head;
     不等会就都移动一步 直到相等
     返回相等时候的fast
 */