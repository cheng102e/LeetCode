package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/8 20:31
 */
public class Q283 {

  public static void moveZeroes(int[] nums) {
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        nums[index] = nums[i];
        index++;
      }

    }
    for (; index < nums.length; index++) {
      nums[index] = 0;
    }
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
