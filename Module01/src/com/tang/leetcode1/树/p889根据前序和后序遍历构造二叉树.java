package com.tang.leetcode1.树;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("all")
public class p889根据前序和后序遍历构造二叉树 {
    Map<Integer, Integer> map = new HashMap<>();
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        for (int i = 0; i < postorder.length; i++) {
            map.put(postorder[i],i);
        }
        int n=preorder.length;
        return  dfs(preorder,postorder,0,n-1,0,n-1);
    }

    private TreeNode dfs(int[] preorder, int[] postorder, int i, int i1, int j, int j1) {
        if (i>i1)return null;
        TreeNode root = new TreeNode(preorder[i]);
        if (i==i1)return root;
        int index=map.get(preorder[i+1]);
        int size=index-j+1;
        root.left= dfs(preorder,postorder,i+1,i+size,j,index);
        root.right= dfs(preorder,postorder,i+size+1,i1,index+1,j1-1);
        return  root;
    }
}
