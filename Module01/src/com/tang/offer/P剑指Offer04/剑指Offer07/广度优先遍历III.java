package com.tang.offer.P剑指Offer04.剑指Offer07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 广度优先遍历III {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> quqeu = new LinkedList<>();
        int a = 1;
        if (root != null) {
            quqeu.offer(root);
            while (!quqeu.isEmpty()) {
                LinkedList<Integer> ans = new LinkedList<>();
                int temp = quqeu.size();
                for (int i = 0; i < temp; i++) {
                    root = quqeu.poll();
                    if (res.size() % 2 == 0) {
                        ans.addLast(root.val);
                    } else {
                        ans.addFirst(root.val);
                    }
                    if (root.left != null) quqeu.add(root.left);
                    if (root.right != null) quqeu.add(root.right);
                }

                res.add(ans);

            }
        }
        return res;
    }
}
/*
使用两个辅助队列 一个加载每次的root值
一个加载每次的值
分层套路
奇数层每次传入的值加在后面
偶数层每次的值加在前面
 */