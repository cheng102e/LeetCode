package todo.Tree;

import Model.TreeNode;

public class Q230 {
    int result = -1;
    int index = 1;

    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return result;
    }

    public void traverse(TreeNode root, int k) {
        if (root == null || result != -1) {
            return;
        }
        traverse(root.left, k);
        if (index == k) {
            result = root.val;
            index++;
            return;
        }
        index++;
        traverse(root.right, k);
    }

}
