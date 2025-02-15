package todo.Greedy;

public class Q53 {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = sum;
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            if (sum < nums[i]) {
                sum = nums[i];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
