public class Q414 {

  public static int thirdMax(int[] nums) {
    if (nums.length == 1) {
      return nums[0];
    } else if (nums.length == 2) {
      return Math.max(nums[0], nums[1]);
    }
    int one = Integer.MIN_VALUE;
    int two = Integer.MIN_VALUE;
    int three = Integer.MIN_VALUE;
    int tnum = 0;
    boolean flag = true;
    for (int i = 0; i < nums.length; i++) {
      if (flag && nums[i] == Integer.MIN_VALUE) {
        tnum++;
        flag = false;
      }
      if (one == nums[i] || two == nums[i] || three == nums[i]) {
        continue;
      }

      tnum++;
      if (nums[i] > one) {
        three = two;
        two = one;
        one = nums[i];
      } else if (nums[i] > two) {
        three = two;
        two = nums[i];
      } else if (nums[i] > three) {
        three = nums[i];
      }
    }
    if (tnum >= 3) {
      return three;
    } else {
      return one;
    }
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
