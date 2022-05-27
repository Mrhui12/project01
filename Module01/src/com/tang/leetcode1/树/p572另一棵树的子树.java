package com.tang.leetcode1.树;

@SuppressWarnings("all")
public class p572另一棵树的子树 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;
        if (root == null) return false;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot) || ismame(root, subRoot);
    }

    private boolean ismame(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;
        if (root == null || subRoot == null) return false;
        if (root.val != subRoot.val) return false;
        return ismame(root.left, subRoot.left) && ismame(root.right, subRoot.right);

    }
}
/*
 判断是否为子树
  用一个子函数

 */