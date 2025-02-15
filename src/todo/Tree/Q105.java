package todo.Tree;

import Model.TreeNode;

public class Q105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder, int pl, int pr, int[] inorder, int il, int ir) {
        if (pl > pr || il > ir) {
            return null;
        }
        int rootVal = preorder[pl];
        int index = 0;
        for (int i = il; i <= ir; i++) {
            if (inorder[i] == rootVal) {
                index = i;
                break;
            }
        }
        int leftSize = index - il;
        TreeNode root = new TreeNode(rootVal);
        root.left = build(preorder, pl + 1, pl + leftSize, inorder, il, index - 1);
        root.right = build(preorder, pl + leftSize + 1, pr, inorder, index + 1, ir);

        return root;
    }
}
