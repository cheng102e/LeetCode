package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/30 18:42
 */
public class Q104 {

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }


  public static int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
