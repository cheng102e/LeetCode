package todo.Tree;

import Model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q145 {

    public void postOrder(TreeNode root , List<Integer> result) {
        if(root == null){
            return;
        }
        postOrder(root.left, result);
        postOrder(root.right, result);
        result.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        postOrder(root, result);
        return result;
    }
}
