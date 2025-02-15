package LeetCode.Q100;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/31 11:28
 */
public class Q67 {

  public static String addBinary(String a, String b) {
    StringBuilder ans = new StringBuilder();
    int len1 = a.length() - 1;
    int len2 = b.length() - 1;
    int num = 0;
    while (len1 >= 0 || len2 >= 0) {
      if (len1 >= 0) {
        num += a.charAt(len1) - '0';
        len1--;
      }
      if (len2 >= 0) {
        num += b.charAt(len2) - '0';
        len2--;
      }
      if (num < 2) {
        ans.insert(0, num);
        num = 0;
      } else {
        ans.insert(0, num - 2);
        num = 1;
      }
    }
    if (num == 1) {
      ans.insert(0, 1);
    }

    return ans.toString();
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
