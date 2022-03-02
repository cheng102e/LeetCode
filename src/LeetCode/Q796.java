package LeetCode;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/2 20:07
 */
public class Q796 {

  public static boolean rotateString(String A, String B) {
    if (A.length() == B.length() && ((A + A).contains(B))) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
