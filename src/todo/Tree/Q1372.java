package todo.Tree;

import Model.TreeNode;

public class Q1372 {
    int max = 0;

    public int longestZigZag(TreeNode root) {
        if (root == null) {
            return 0;
        }

        //0左1右
        dfs(root.left, 1, 0);
        dfs(root.right, 1, 1);

        return max;
    }

    private void dfs(TreeNode root, int count, int direction) {
        if (root == null) {
            return;
        }

        max = Math.max(max, count);
        dfs(root.left, direction == 0 ? 1 : count + 1, 0);
        dfs(root.right, direction == 1 ? 1 : count + 1, 1);

    }
}
