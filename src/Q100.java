/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/7 20:28
 */
public class Q100 {

  public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  public static boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }

    if (p != null && q != null && p.val == q.val) {
      return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    } else {

      return false;
    }

  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
