package com.tang.leetCodeHot100;

public class p114二叉树展开为链表 {
    //private  TreeNode pre=null;
    public void flatten(TreeNode root) {
        while (root != null) {
            if (root.left == null) root = root.right;
            else {
                TreeNode pre = root.left;
                while (pre.right != null) pre = pre.right;
                pre.right = root.right;
                root.right = root.left;
                root.left = null;
                root = root.right;
            }
        }
        /*
            if(root==null)
            return;
            flatten(root.right);
            falatten(root.left);
            root.right=pre;
            root.left=null;
            pre=root;
         */
    }
}
/*
一种拼接得方法
根据先序便利得顺序
先判断根节点是否为空
不为得话再判断左字节的是否为空 为就直接等于下一个右节点
反正吧左边节点取出来 不断不便利其右子节点
然后让下一个右子节点等于右子树
右子树等于左子树
左子树等于空 继续到一下一节点
 */