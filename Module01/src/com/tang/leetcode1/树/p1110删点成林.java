package com.tang.leetcode1.树;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings("all")
public class p1110删点成林 {
    private List<TreeNode> res;
    private Set<Integer> dict;
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        res=new ArrayList<>();
        dict=new HashSet<>();
        for(int num:to_delete){
            dict.add(num);
        }
        root=helper(root);
        if(root!=null)res.add(root);
        return res;
    }
    private TreeNode helper(TreeNode root){
        if(root==null)return null;

        root.right=helper(root.right);//后续递归遍历
        root.left=helper(root.left);//递归遍历
        if(dict.contains(root.val)){//判断当前节点是否包含
            if(root.left!=null)//如果左右节点不为空直接加入左右的结果
                res.add(root.left);
            if(root.right!=null)
                res.add(root.right);

            root=null;//最后让这个节点为null
        }
        return root;//最后返回节点值
    }
}
/*
思路   用哈希表 装 删除的节点值
   用一个辅助 函数
    后续递归遍历 树
    递归结束 为 当前节点为空1
    返回的是顶前节点
    当 包含的 时候1 结果加入 不为null 的左右节点的值
 */