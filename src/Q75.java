/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/14 20:35
 */
public class Q75 {

  public static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

  public void sortColors(int[] nums) {
    int index0 = 0, index1 = 0, index2 = nums.length - 1;
    while (index1 <= index2) {
      if (nums[index1] == 0) {
        swap(nums, index1, index0);
        index0++;
        index1++;
      } else if (nums[index1] == 2) {
        swap(nums, index1, index2);
        index2--;
      } else {
        index1++;
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
