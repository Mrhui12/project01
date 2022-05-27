package com.tang.leetcode1.树;

@SuppressWarnings("all")
public class p530二叉搜索树的最小绝对差 {
    TreeNode pre = null;
    private int min = 10000;

    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return min;
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        if (pre != null)
            min = Math.min(min, root.val - pre.val);
        pre = root;
        dfs(root.right);
    }
}
