package com.tang.leetcode1.树;
@SuppressWarnings("all")
public class p538把二叉搜索树转换为累加树 {
    public TreeNode convertBST(TreeNode root) {
        int sum=0;
        if(root!=null){
            convertBST(root.right);
            sum+= root.val;
            root.val=sum;
            convertBST(root.left);
        }
        return root;
    }
}
/*

        利用二插累加速的特点 实现  从高到低实现

 */