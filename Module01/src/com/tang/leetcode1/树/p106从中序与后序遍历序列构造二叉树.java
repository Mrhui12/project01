package com.tang.leetcode1.树;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class p106从中序与后序遍历序列构造二叉树 {
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        int n = inorder.length;
        return dfs(inorder, postorder, 0, n - 1, 0, n - 1);
    }

    private TreeNode dfs(int[] inorder, int[] postorder, int i, int i1, int j, int j1) {
        if (i > i1) return null;
        TreeNode root = new TreeNode(postorder[j1]);
        int index = map.get(postorder[j1]);
        int size = index - i;
        root.left = dfs(inorder, postorder, i, index - 1, j, j + size - 1);
        root.right = dfs(inorder, postorder, index + 1, i1, j + size, j1 - 1);
        return root;
    }
}
