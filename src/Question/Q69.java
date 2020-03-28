package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/1 9:15
 */
public class Q69 {

  public static int mySqrt(int x) {
    if (x == 1 || x == 0) {
      return x;
    }
    int start = 0;
    int end = x;
    while (end - start >= 1) {
      int mid = (start + end) / 2;

      if (x / mid > mid) {
        start = mid;
      } else {
        end = mid;
      }
    }
    return start;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }

}
