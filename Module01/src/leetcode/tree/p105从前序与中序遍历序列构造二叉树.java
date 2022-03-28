package leetcode.tree;

import java.util.HashMap;

public class p105从前序与中序遍历序列构造二叉树 {
    HashMap<Integer, Integer> map;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        int n = preorder.length;
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }
        return mybuildTree(preorder, inorder, 0, n - 1, 0, n - 1);
    }

    private TreeNode mybuildTree(int[] preorder, int[] inorder, int i, int i1, int i2, int i3) {
        if (i > i1) return null;
        int preorder_root = i;
        int inorder_root = map.get(preorder[preorder_root]);
        TreeNode root = new TreeNode(preorder[preorder_root]);
        int size = inorder_root - i2;
        root.left = mybuildTree(preorder, inorder, i + 1, i + size, i2, inorder_root - 1);
        root.right = mybuildTree(preorder, inorder, i + size + 1, i1, inorder_root + 1, i3);
        return root;
    }
}
