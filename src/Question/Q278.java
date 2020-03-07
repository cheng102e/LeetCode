package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/3 18:42
 */
public class Q278 {

  public static boolean isBadVersion(int version) {
    return true;
  }

  public static int firstBadVersion(int n) {
    int left = 1;
    int right = n;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (isBadVersion(mid) == true) {
        right = mid - 1;
      } else if (isBadVersion(mid) == false) {
        left = mid + 1;
      }
    }
    return left;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
