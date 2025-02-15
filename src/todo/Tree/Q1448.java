package todo.Tree;

import Model.TreeNode;

public class Q1448 {
    int count = 0;

    public int goodNodes(TreeNode root) {
        bfs(root, Integer.MIN_VALUE);
        return count;
    }

    void bfs(TreeNode root, int max) {
        if (root == null) {
            return;
        }
        if (root.val >= max) {
            count++;
            max = root.val;
        }
        bfs(root.left, max);
        bfs(root.right, max);
    }
}
