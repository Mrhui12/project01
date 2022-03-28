package leetcode.tree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Stack;

public class p144二叉树的前序遍历 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> treeNodes = new Stack<>();//用栈来实现
        if (root == null) return res;
        treeNodes.push(root);
        while (!treeNodes.isEmpty()) {
            TreeNode nodes = treeNodes.peek();
            res.add(nodes.val);
            treeNodes.pop();
            if (nodes.right != null)
                treeNodes.push(nodes.right);
            if (nodes.left != null)
                treeNodes.push(nodes.left);


        }
        return res;
    }
}
