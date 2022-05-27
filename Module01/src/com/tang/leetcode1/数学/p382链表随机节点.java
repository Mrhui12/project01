package com.tang.leetcode1.数学;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SuppressWarnings("all")
public class p382链表随机节点 {
//    List<Integer> lists = new ArrayList<>();
//    Random random=new Random();
//    public void Solution(ListNode head) {
//      while (head!=null){
//          lists.add(head.val);
//          head=head.next;
//      }
//    }
//
//    public int getRandom() {
//     return  lists.get(random.nextInt(lists.size()));
//    }

    //    解法二
    ListNode head1;
    Random random = new Random();

    public void Solution(ListNode head) {
        head1 = head;
    }

    public int getRandom() {
        int ans = 0, index = 0;
        ListNode t = head1;
        while (t != null && ++index >= 0) {
            if (random.nextInt(index) == 0) ans = t.val;
            t = t.next;
        }
        return ans;
    }
}
/*
  随机问题 就得用random
   先建立一个集合
   和一个random
   初始化 当 head!=null
   往集合里面添加 head.val
    head=head.next;
     之后获取随机数
      random.nextInt(list.size())
      return list.get(index);
 */