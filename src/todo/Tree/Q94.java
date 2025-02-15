package todo.Tree;

import Model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q94 {

    public void inOrder(TreeNode root , List<Integer> result) {
        if(root == null){
            return;
        }
        inOrder(root.left, result);
        result.add(root.val);
        inOrder(root.right, result);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        inOrder(root, result);
        return result;
    }
}
