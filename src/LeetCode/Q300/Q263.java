package LeetCode.Q300;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/4 14:07
 */
public class Q263 {

  public static boolean isUgly(int num) {
    if (num < 1) {
      return false;
    }
    while (num % 5 == 0) {
      num = num / 5;
    }
    while (num % 3 == 0) {
      num = num / 3;
    }
    while (num % 2 == 0) {
      num = num / 2;
    }
    return num == 1;

  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
