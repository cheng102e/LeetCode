package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/2 20:37
 */
public class Q26 {

  public static int removeDuplicates(int[] nums) {
    int index = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != nums[index]) {
        index++;
        nums[index] = nums[i];
      }
    }
    return index + 1;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
