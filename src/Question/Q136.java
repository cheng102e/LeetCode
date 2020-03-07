package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/4 10:15
 */
public class Q136 {

  public static int singleNumber(int[] nums) {
    int n = 0;
    for (int i = 0; i < nums.length; i++) {
      n = n ^ nums[i];
    }
    return n;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }

}
