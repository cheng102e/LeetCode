package todo.Tree;

import Model.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Q103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offerLast(root);
        int size = 1;
        boolean right = true;
        while (!deque.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            if (right) {
                for (int i = 0; i < size; i++) {
                    TreeNode node = deque.pollFirst();
                    if (node.left != null) {
                        deque.offerLast(node.left);
                    }
                    if (node.right != null) {
                        deque.offerLast(node.right);
                    }
                    list.add(node.val);
                }
                right = false;
            } else {
                for (int i = 0; i < size; i++) {
                    TreeNode node = deque.pollLast();
                    if (node.right != null) {
                        deque.offerFirst(node.right);
                    }
                    if (node.left != null) {
                        deque.offerFirst(node.left);
                    }
                    list.add(node.val);
                }
                right = true;
            }
            result.add(list);
            size = deque.size();
        }
        return result;
    }
}
