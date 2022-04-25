package com.tang.leetCodeHot100;

public class p98验证二叉搜索树 {
    int pre=Integer.MIN_VALUE;
    public boolean isValidBST(TreeNode root){
        if (root==null)return true;
        if (!isValidBST(root.left)){
            return false;
        }
        if (root.val<=pre)return false;
        pre= root.val;
        return isValidBST(root.right);
    }
}
/*
中序遍历
遇到搜索树就中序遍历
前一个值和当前值作比较 并且

 */