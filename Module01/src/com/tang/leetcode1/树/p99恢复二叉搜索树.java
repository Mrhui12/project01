package com.tang.leetcode1.树;

@SuppressWarnings("all")
public class p99恢复二叉搜索树 {
    TreeNode x = null, y = null, pre = null;

    public void recoverTree(TreeNode root) {
        dfs(root);
        if (x != null && y != null) {
            int temp = x.val;
            x.val = y.val;
            y.val = temp;
        }
    }

    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        if (pre == null) pre = root;
        else {
            if (pre.val > root.val) {
                if (x == null) x = pre;
                y = root;
            }
            pre=root;
        }
       dfs(root.right);

    }
}

