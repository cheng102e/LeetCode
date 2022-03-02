package LeetCode;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/31 11:28
 */
public class Q167 {

  public static int[] twoSum(int[] numbers, int target) {
    int start = 0;
    int end = numbers.length - 1;
    while (numbers[start] + numbers[end] != target) {

      if (numbers[start] + numbers[end] < target) {
        start++;
      } else {
        end--;
      }
    }
    int[] res = new int[2];
    res[0] = start + 1;
    res[1] = end + 1;
    return res;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
