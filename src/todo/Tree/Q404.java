package todo.Tree;

import Model.TreeNode;

public class Q404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int right = sumOfLeftLeaves(root.right);
        int left;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            left = root.left.val;
        } else {
            left = sumOfLeftLeaves(root.left);
        }
        return left + right;

    }
}

