package LeetCode.Q100;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/28 14:56
 */
public class Q58 {

  public static int lengthOfLastWord(String s) {
    if (s.length() < 1) {
      return 0;
    }
    int end = s.length() - 1;
    while (end >= 0 && s.charAt(end) == ' ') {
      end--;
    }
    if (end < 0) {
      return 0;
    }
    int num = 0;
    while (end >= 0 && s.charAt(end) != ' ') {
      end--;
      num++;
    }
    return num;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
