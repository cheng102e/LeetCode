package todo.Tree;

import Model.TreeNode;

public class Q110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return (Math.abs(height(root.left) - height(root.right)) <= 1)
                    && isBalanced(root.right) && isBalanced(root.left);
        }
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}
