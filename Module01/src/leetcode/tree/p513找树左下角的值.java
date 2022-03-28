package leetcode.tree;

import java.util.Deque;
import java.util.LinkedList;

public class p513找树左下角的值 {//利用队列先进先出 先进右边的字数 后进左边的指数
    public int findBottomLeftValue(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            root = deque.poll();
            if (root.right != null)
                deque.offer(root.right);
            if (root.left != null)
                deque.offer(root.left);
        }
        return root.val;
    }
}
