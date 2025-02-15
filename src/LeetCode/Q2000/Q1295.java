package LeetCode.Q2000;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/4 11:26
 */
public class Q1295 {

  public static int findNumbers(int[] nums) {
    int count = 0;
    for (int num : nums) {
      if ((10 <= num && num <= 99) || (1000 <= num && num <= 9999) || num == 100000) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
