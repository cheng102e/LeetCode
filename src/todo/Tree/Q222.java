package todo.Tree;

import Model.TreeNode;

public class Q222 {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return countNodes(root.left) + countNodes(root.right) + 1;
        }
    }
}
