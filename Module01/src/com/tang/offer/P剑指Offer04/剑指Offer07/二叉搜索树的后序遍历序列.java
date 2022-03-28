package com.tang.offer.P剑指Offer04.剑指Offer07;

public class 二叉搜索树的后序遍历序列 {
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    private boolean recur(int[] postorder, int i, int j) {
        if (i >= j) return true;//i 在递归过程中右边的时候不为0

        int p = i;//临时变量 等于头节点
        while (postorder[p] < postorder[j]) p++;//找到右子树
        int m = p;
        while (postorder[p] > postorder[j]) p++;//确保是顺序二叉树
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);//判断当前或加上左右子树
    }
}
