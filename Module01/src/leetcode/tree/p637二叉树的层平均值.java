package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class p637二叉树的层平均值 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> Avanage = new ArrayList<>();
        Queue<TreeNode> treeNodes = new LinkedList<>();//使用链表先进先出 offer poll
        treeNodes.offer(root);
        while (!treeNodes.isEmpty()) {
            double sum = 0;
            int size = treeNodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = treeNodes.poll();
                sum += node.val;
                TreeNode left = node.left;
                TreeNode right = node.right;
                if (left != null) treeNodes.offer(left);
                if (right != null) treeNodes.offer(right);
            }
            Avanage.add(sum / size);
        }
        return Avanage;
    }

}
