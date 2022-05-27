package com.tang.leetcode1.妙用数据结构;


import java.util.Comparator;
import java.util.PriorityQueue;

@SuppressWarnings("all")
public class p23合并K个升序链表 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> q = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        for (ListNode list : lists) {
            if (lists != null) q.add(list);
        }
        while (!q.isEmpty()) {
            p.next = q.poll();
            p = p.next;
            if (p.next != null) q.add(p.next);
        }
        return dummy.next;
//        ListNode ans=null;
//        for (ListNode list : lists) {
//            ans=mergeTwoLists(ans,list);
//        }
//        return ans;
    }

//    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1==null||l2==null)
//            return l1==null?l2:l1;
//        if (l1.val>l2.val){
//            l1.next= mergeTwoLists(l1.next,l2);
//            return l1;
//        }
//       else {
//            l2.next= mergeTwoLists(l1,l2.next);
//            return l2;
//        }
//    }
}
/*
思路 1.优先队列 当为空的时候就直接返回null
   创建一个优先队列 升序的吧头节点的值放进去
  PriorityQuqeue<ListNode> queue =  new PriorityQueue<>(lists.length,new Comparator<ListNode>(){
  @Override
    public int compara(ListNode o1, ListNode o2){
    return o1.val-o2.val;
    }
  });
  便利 链表组
  如果 不为空就加进去
   之后 整一个结果链表 和一个临时链表
   ListNode res=new ListNode(0);
   ListNOde ans=res;
   当queue不为空 就
   ans.nest=queue.poll();
   ans=ans.next;
   if(ans.next!=null)queue.add(ans.next);

  返回 res。next；

2.两两合璧两个链表
 为空直接返回
 整一个临时结果
  ListNode ans=null;
  便利何必两个链表

 */