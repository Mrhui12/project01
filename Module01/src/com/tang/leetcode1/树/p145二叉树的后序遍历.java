package com.tang.leetcode1.树;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all")
public class p145二叉树的后序遍历 {
    List<Integer> res = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            res.add(root.val);
        }
        return res;
    }
}

