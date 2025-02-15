package todo.Tree;

import Model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q872 {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> nodeList1 = getList(root1,new ArrayList<>());
        List<Integer> nodeList2 = getList(root2,new ArrayList<>());
        return nodeList1.equals(nodeList2);
    }

    public List<Integer> getList(TreeNode root,List<Integer> list){
        if(root == null){
            return list;
        }
        list = getList(root.left,list);
        if(root.left == null && root.right == null){
            list.add(root.val);
        }
        list = getList(root.right,list);
        return list;
    }
}
