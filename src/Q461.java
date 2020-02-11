/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/11 20:13
 */
public class Q461 {

  public static int hammingDistance(int x, int y) {
    int xor = x ^ y;
    int num = 0;
    while (xor != 0) {
      if ((xor & 1) == 1) {
        num++;
      }
      xor = xor >> 1;
    }
    return num;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
