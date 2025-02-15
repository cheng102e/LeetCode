package todo.Tree;

import Model.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Q144 {

    public void preOrder(TreeNode root , List<Integer> result) {
        if(root == null){
            return;
        }
        result.add(root.val);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        preOrder(root, result);
        return result;
    }

    public List<Integer> preorderTraversal1(TreeNode root) {
        // 迭代
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        preOrder(root, result);
        return result;
    }
}
