package todo.Tree;

import Model.TreeNode;

public class Q124 {
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        getValue(root);
        return max;
    }

    public int getValue(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getValue(root.left);
        int right = getValue(root.right);
        int sum = Math.max(left, 0) + Math.max(right, 0) + root.val;
        max = Math.max(sum, max);
        int leftValue = Math.max(left, 0) + root.val;
        int rightValue = Math.max(right, 0) + root.val;

        return Math.max(leftValue, Math.max(rightValue, 0));
    }
}
