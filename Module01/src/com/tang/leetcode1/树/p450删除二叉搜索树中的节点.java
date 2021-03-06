package com.tang.leetcode1.树;

@SuppressWarnings("all")
public class p450删除二叉搜索树中的节点 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val > key) root.left = deleteNode(root.left, key);
        else if (root.val < key) root.right = deleteNode(root.right, key);
        else {
            if (root.right == null) return root.left;
            else if (root.left == null) return root.right;
            else if (root.right != null && root.left != null) {
                TreeNode node = root.right;
                while (node.left != null) node = node.left;
                node.left = root.left;
                root = root.right;
            }

        }
        return root;
    }
}
/*
     给定一个二叉搜索树的根节点 root 和一个值 key，删除二叉搜索树中的 key 对应的节点，并保证二叉搜索树的性质不变。返回二叉搜索树（有可能被更新）的根节点的引用。

一般来说，删除节点可分为两个步骤：

首先找到需要删除的节点；
如果找到了，删除它。

    根节点和 值作比较
    判断位于哪个区间 如果就是当前区间  判断 子树 是否有为空的
 */