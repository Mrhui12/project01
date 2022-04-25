package com.tang.leetCodeHot100;

public class p104二叉树的最大深度 {
    public int maxDepth(TreeNode root){
        return root==null?0:Math.max(maxDepth(root.right),maxDepth(root.left))+1;
    }
}
/*
递归实现最大数得便利
 */