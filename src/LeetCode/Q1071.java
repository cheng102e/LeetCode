package LeetCode;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-12 11:41
 */
public class Q1071 {

  public int gcd(int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return gcd(b, a % b);
    }
  }

  public String gcdOfStrings(String str1, String str2) {
    if ((str1 + str2).equals(str2 + str1)) {
      return str1.substring(0, gcd(str1.length(), str2.length()));
    } else {
      return "";
    }
  }
}
