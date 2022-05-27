package com.tang.leetcode1.树;

@SuppressWarnings("all")
public class p404左叶子之和 {
    public int sumOfLeftLeaves(TreeNode root) {
        return root == null ? 0 : dfs(root);
    }

    private int dfs(TreeNode root) {
        int ans = 0;
        if (root.left != null) {//当一个点的子叶点不为空 且 为子叶点 直接加它的值 必不然继续递归
            ans += isleaf(root.left) ? root.left.val : dfs(root.left);
        }
        if (root.right != null) {
            ans += isleaf(root.right) ? 0 : dfs(root.right);
        }
        return  ans;
    }

    private boolean isleaf(TreeNode root) {//判断一个点是不是子叶点
        return root.left == null && root.right == null;
    }
}
/*
 左边子叶点的和  判断一个点子叶点
 */