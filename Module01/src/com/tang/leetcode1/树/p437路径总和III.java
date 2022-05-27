package com.tang.leetcode1.树;

@SuppressWarnings("all")
public class p437路径总和III {
    public int pathSum(TreeNode root, int targetSum) {
        return root == null ? 0 : pathSumWithRoot(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    private int pathSumWithRoot(TreeNode root, int targetSum) {
        if (root == null) return 0;
        int count = root.val == targetSum ? 1 : 0;
        count += pathSumWithRoot(root.left, targetSum - root.val);
        count += pathSumWithRoot(root.right, targetSum - root.val);
        return count;
    }
}
/*
借助一个辅助函数
 计算当前节点 的数值大小
  考虑加入当前 或者不加入当前
  加入当前就进入辅助函数
  不然递归下一个函数
  工辅助函数  当root==null 返回0

 */