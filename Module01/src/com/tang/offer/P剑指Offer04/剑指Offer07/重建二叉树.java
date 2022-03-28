package com.tang.offer.P剑指Offer04.剑指Offer07;


import java.util.HashMap;
import java.util.Map;

public class 重建二叉树 {
    Map<Integer, Integer> map;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        map = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }
        return rebuild(preorder, inorder, 0, n - 1, 0, n - 1);

    }

    private TreeNode rebuild(int[] preorder, int[] inorder, int left, int right, int left1, int right1) {
        if (left > right) return null;
        TreeNode node = new TreeNode(preorder[left]);

        int i = map.get(preorder[left]), leng = i - left1;

        node.left = rebuild(preorder, inorder, left + 1, left + leng, left1, i - 1);
        node.right = rebuild(preorder, inorder, left + 1 + leng, right, i + 1, right1);
        return node;

    }
}
