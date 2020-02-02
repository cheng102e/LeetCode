/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/2 20:37
 */
public class Q27 {

  public static int removeElement(int[] nums, int val) {
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[index]=nums[i];
        index++;
      }
    }
    return index;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
