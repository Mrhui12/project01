package com.tang.leetcode1.树;

@SuppressWarnings("all")
public class p110平衡二叉树 {
    public boolean isBalanced(TreeNode root) {
        return helper(root) != -1;
    }

    private int helper(TreeNode root) {
        if (root == null) return 0;
        int left = helper(root.left), right = helper(root.right);
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }
        return 1 + Math.max(left, right);
    }
}
