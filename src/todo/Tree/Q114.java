package todo.Tree;

import Model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q114 {
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        List<TreeNode> list = new ArrayList<>();
        tranverse(root, list);
        root.left = null;
        for (int i = 1; i < list.size(); i++) {
            list.get(i - 1).right = list.get(i);
            list.get(i).left = null;
        }
    }

    public void tranverse(TreeNode node, List<TreeNode> list) {
        if (node == null) {
            return;
        }
        list.add(node);
        tranverse(node.left, list);
        tranverse(node.right, list);
    }
}
