package com.tang.leetcode1.树;

@SuppressWarnings("all")
public class p617合并二叉树 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return root1 == null ? root2 : root1;
        TreeNode root = new TreeNode();
        root.val = root1.val + root2.val;
        root.left = mergeTrees(root1.left, root2.left);
        root.right = mergeTrees(root1.right, root2.right);
        return root;
    }
}
/*
   合并二叉树 当 一个为空 直接返回另一个
   新建一个 root  等于二者之和2
   坐左边的递归左边的
   右边的递归右边的

 */