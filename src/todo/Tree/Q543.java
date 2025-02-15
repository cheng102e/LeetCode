package todo.Tree;

import Model.TreeNode;

public class Q543 {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        getDepth(root);
        return max - 1;
    }

    public int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if (left + right + 1 > max) {
            max = left + right + 1;
        }
        return Math.max(left, right) + 1;
    }
}
