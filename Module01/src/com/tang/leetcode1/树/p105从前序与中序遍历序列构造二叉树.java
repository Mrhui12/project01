package com.tang.leetcode1.树;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class p105从前序与中序遍历序列构造二叉树 {
    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }
        return dfs(preorder, inorder, 0, n - 1, 0, n - 1);
    }

    private TreeNode dfs(int[] preorder, int[] inorder, int pre1, int pre2, int in1, int in2) {
        if (pre1 > pre2) return null;
        int pre_index = pre1;
        TreeNode root = new TreeNode(preorder[pre_index]);
        int in_index = map.get(preorder[pre_index]);
        int size = in_index - in1;
        root.left = dfs(preorder, inorder, pre1 + 1, pre1 + size, in1, in_index - 1);
        root.right = dfs(preorder, inorder, pre1 + size + 1, pre2, in_index + 1, in2);
        return root;
    }
}
