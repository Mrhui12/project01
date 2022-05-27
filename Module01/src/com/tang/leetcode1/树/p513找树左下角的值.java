package com.tang.leetcode1.树;

import java.util.Deque;
import java.util.LinkedList;

@SuppressWarnings("all")
public class p513找树左下角的值 {
    public int findBottomLeftValue(TreeNode root) {
        Deque<TreeNode> list = new LinkedList<>();
        list.offer(root);
        while (!list.isEmpty()){
            root=list.poll();
            if (root.right!=null)list.offer(root.right);
            if (root.left!=null)list.offer(root.left);
        }
        return  root.val;
    }
}
/*
 广度优先收搜 利用链表 先进右边 后进左边
 */