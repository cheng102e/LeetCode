package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/3 17:09
 */
public class Q374 {

  public static int guess(int version) {
    return 1;
  }

  public static int guessNumber(int n) {
    int left = 1;
    int right = n;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (guess(mid) == 0) {
        return mid;
      } else if (guess(mid) == 1) {
        left = mid + 1;
      } else if (guess(mid) == -1) {
        right = mid - 1;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
