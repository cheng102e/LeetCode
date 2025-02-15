package todo.Tree;

import Model.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Q513 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int result = 0;
        queue.offer(root);
        while (!queue.isEmpty()) {

            TreeNode node = queue.poll();
            if (node.right != null) {
                queue.offer(node.right);
            }
            if (node.left != null) {
                queue.offer(node.left);
            }
            result = node.val;

        }
        return result;
    }
}
