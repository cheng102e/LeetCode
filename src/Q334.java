public class Q334 {

  public boolean increasingTriplet(int[] nums) {
    if (nums.length < 3) {
      return false;
    }
    int one = Integer.MAX_VALUE;
    int two = Integer.MAX_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > two) {
        return true;
      }
      if (nums[i] < one) {
        one = nums[i];
      }
      if (nums[i] > one && nums[i] < two) {
        two = nums[i];
      }

    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
