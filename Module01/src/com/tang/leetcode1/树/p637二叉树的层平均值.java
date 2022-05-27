package com.tang.leetcode1.树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@SuppressWarnings("all")
public class p637二叉树的层平均值 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> temp = new LinkedList<>();
        temp.offer(root);
        while (!temp.isEmpty()) {
            int n = temp.size();
            double sum = 0;
            for (int i = 0; i < n; i++) {
                TreeNode node = temp.poll();
                sum += node.val;
                if (node.left != null) temp.offer(node.left);
                if (node.right != null) temp.offer(node.right);
            }
            res.add(sum / n);

        }
        return res;
    }
}
