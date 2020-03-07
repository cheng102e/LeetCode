package Question;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-02-27 17:11
 */
public class Q303 {

  private int[] sum;

  public void NumArray(int[] nums) {
    if(nums.length==0)
    {
      return;
    }
    sum = new int[nums.length];
    sum[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      sum[i] += sum[i - 1] + nums[i];
    }
  }

  public int sumRange(int i, int j) {
    if (i == 0) {
      return sum[j];
    } else {
      return sum[j] - sum[i - 1];
    }
  }
}
