package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/30 18:42
 */
public class Q111 {

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }


  public static int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    if (root.left == null && root.right == null) {
      return 1;
    }
    if (root.left == null || root.right == null) {
      return minDepth(root.right) + minDepth(root.left) + 1;
    }
    return 1 + Math.min(minDepth(root.left), minDepth(root.right));
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
