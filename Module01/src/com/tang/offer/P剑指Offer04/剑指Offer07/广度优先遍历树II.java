package com.tang.offer.P剑指Offer04.剑指Offer07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 广度优先遍历树II {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> Quqeu = new LinkedList<>();
        if (root != null) {
            Quqeu.offer(root);
            while (!Quqeu.isEmpty()) {
                ArrayList<Integer> ans = new ArrayList<>();
                int temp = Quqeu.size();
                for (int i = 0; i < temp; i++) {
                    root = Quqeu.poll();
                    ans.add(root.val);
                    if (root.left != null) Quqeu.offer(root.left);
                    if (root.right != null) Quqeu.offer(root.right);
                }
                res.add(ans);
            }
        }
        return res;
    }
}
/*
还是用上队列的广度优先遍历
用上辅助集合 每次循环刷新集合
循环的大小为每一层的Quque.size();
每次循环结束就把结果集合加入答案
 */