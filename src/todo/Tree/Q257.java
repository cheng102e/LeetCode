package todo.Tree;

import Model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Q257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<String>();
        buildTreePaths(root, new StringBuilder(), paths);
        return paths;
    }

    public void buildTreePaths(TreeNode root, StringBuilder sb, List<String> paths) {
        if (root == null) {
            return;
        }

        if (sb.length() > 0) {
            sb.append("->");
        }
        sb.append(root.val);
        if(root.left == null && root.right == null) {
            paths.add(sb.toString());
        }else {
            buildTreePaths(root.left, new StringBuilder(sb), paths);
            buildTreePaths(root.right, new StringBuilder(sb), paths);
        }

    }
}
