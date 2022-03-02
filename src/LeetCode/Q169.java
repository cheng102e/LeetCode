package LeetCode;

public class Q169 {

  public static int majorityElement(int[] nums) {
    int count = 0;
    int number = nums[0];
    for (int i = 0; i < nums.length; i++) {
      if (count == 0) {
        number = nums[i];
        count = 1;
      } else if (number != nums[i]) {
        count--;
      } else {
        count++;
      }
    }
    return number;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
