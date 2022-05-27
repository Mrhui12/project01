package com.tang.leetcode1.树;

@SuppressWarnings("all")
public class p104二叉树的最大深度 {
    public int deep(TreeNode root) {
        return root == null ? 0 : Math.max(deep(root.left), deep(root.right)) + 1;
    }
}
