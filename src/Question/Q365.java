package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-21 10:13
 */
public class Q365 {

  public int gcd(int x, int y) {
    if (y == 0) {
      return x;
    }
    int r = x % y;
    return gcd(y, r);
  }

  public boolean canMeasureWater(int x, int y, int z) {
    if (x == 0 && y == 0) {
      return z == 0;
    }
    return z == 0 || (z % gcd(x, y) == 0 && x + y >= z);
  }

}
