package todo.Array;

public class Q334 {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int first = nums[0];
        int second = Integer.MAX_VALUE;
        for (int i = 1; i < nums.length; i++) {
            // 递增，成功
            if (nums[i] > second) {
                return true;
            }

            if (nums[i] > first && nums[i] < second) {
                // 更小的second替换
                second = nums[i];
            } else if (nums[i] < first) {
                // 方便之后用更小的second（目前的seconde前面有一个first，所以不影响结果）
                first = nums[i];
            }
        }
        return false;
    }
}
