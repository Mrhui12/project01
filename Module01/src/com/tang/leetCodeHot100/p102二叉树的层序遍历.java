package com.tang.leetCodeHot100;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class p102二叉树的层序遍历 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root != null) queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode temp = queue.poll();
                ans.add(temp.val);
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            res.add(ans);

        }
        return res;
    }
}
/*
BPS 遍历 出来为数组
所以我们得分层
用 一个 size
控制分层；
 */