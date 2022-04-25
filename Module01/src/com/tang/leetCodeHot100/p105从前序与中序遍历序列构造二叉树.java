package com.tang.leetCodeHot100;

import java.util.HashMap;

public class p105从前序与中序遍历序列构造二叉树 {
    HashMap<Integer, Integer> map;

    public TreeNode buildtree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        int n = preorder.length;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return mybulidTree(preorder, inorder, 0, n - 1, 0, n - 1);

    }

    private TreeNode mybulidTree(int[] preorder, int[] inorder, int i, int i1, int j, int j1) {
        if (i > i1)
            return null;//判断是否为空
        int preoder_root = i;
        int inorder_root = map.get(preorder[preoder_root]);
        TreeNode root = new TreeNode(preorder[preoder_root]);
        int size = inorder_root - j;
        root.left = mybulidTree(preorder, inorder, i + 1, i + size, j, inorder_root - 1);
        root.right = mybulidTree(preorder, inorder, i + size + 1, j1, inorder_root + 1, j1);
        return root;
    }
}
