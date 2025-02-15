package todo.Tree;

import Model.TreeNode;

public class Q226 {
    public void swap(TreeNode node) {
        if(node == null){
            return;
        }
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        swap(node.left);
        swap(node.right);
    }
    public TreeNode invertTree(TreeNode root) {
        swap(root);
        return root;
    }
}
