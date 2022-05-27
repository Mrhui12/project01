package com.tang.leetcode1.树;

@SuppressWarnings("all")
public class p101对称二叉树 {
    public boolean isSymmetric(TreeNode root) {
        return root == null ? true : isSymmetricroot(root.left, root.right);
    }

    private boolean isSymmetricroot(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        else if (left == null || right == null) return false;
        if (right.val != left.val) return false;
        return isSymmetricroot(right.left, left.right) && isSymmetricroot(right.right, left.left);
    }
}
/*
    借助辅助函数判断
    如果当前为root==null
    辅助函数
 */