package todo.Tree;

import Model.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Q106 {
    Map<Integer, Integer> map;  // 方便根据数值查找位置

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        // 前闭后开
        return findNode(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }

    public TreeNode findNode(int[] inorder, int inBegin, int inEnd, int[] postorder, int postBegin, int postEnd) {
        if (inBegin >= inEnd || postBegin >= postEnd) {
            return null;
        }
        int rootVal = postorder[postEnd - 1];
        int rootIndex = map.get(rootVal);
        TreeNode root = new TreeNode(rootVal);
        int leftSize = rootIndex - inBegin;
        root.left = findNode(inorder, inBegin, rootIndex, postorder, postBegin, postBegin + leftSize);
        root.right = findNode(inorder, rootIndex + 1, inEnd, postorder, postBegin + leftSize, postEnd - 1);
        return root;
    }
}
