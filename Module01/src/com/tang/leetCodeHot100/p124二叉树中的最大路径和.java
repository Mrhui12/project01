package com.tang.leetCodeHot100;

public class p124二叉树中的最大路径和 {
    int maxSum = Integer.MIN_VALUE;//先定义一个最大值

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSum;
    }

    private int dfs(TreeNode root) {
        if (root == null) return 0;//如果节点为空 返回0
        int left = dfs(root.left);//反之递归左子树
        int right = dfs(root.right);//递归右子树
        maxSum = Math.max(maxSum, root.val + left + right);//更新最大值
        int max = Math.max(root.val + left, root.val + right);//当下节点 往下得最大值
        return max < 0 ? 0 : max;//如果小于零 就不考虑继续往下 直接返回0l;不要当前节点了
    }
}
/*

 */