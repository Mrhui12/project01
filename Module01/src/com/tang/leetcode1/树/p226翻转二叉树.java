package com.tang.leetcode1.树;

@SuppressWarnings("all")
public class p226翻转二叉树 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
/*
        翻转就是交换
        递归的进行
        当前节点 为空直接返回 不烦交换左右节点
        然后 递归 子节点
        最后再 返回 root

 */