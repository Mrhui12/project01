package com.tang.offer.P剑指Offer04.剑指Offer07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 深度优先遍历数I {
    public int[] levelOrder(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> qeque = new LinkedList<>();
        qeque.offer(root);

        ArrayList<Integer> ans = new ArrayList<>();
        while (!qeque.isEmpty()) {
            root = qeque.poll();
            ans.add(root.val);
            if (root.left != null)
                qeque.offer(root.left);
            if (root.right != null) ;
            qeque.offer(root.right);
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);

        }
        return res;
    }
}
/*
链表加广度有限优先搜索
因为用一个集合暂时保存数据 ；
最后在根据集合大小，遍历集合把集合数据存在数组中
集合有序的
 */