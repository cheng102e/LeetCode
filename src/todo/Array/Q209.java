package todo.Array;

public class Q209 {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int maxLength = Integer.MAX_VALUE;
        int sum = 0;
        while (end < nums.length) {
            sum += nums[end];
            while (sum >= target){
                maxLength = Math.min(maxLength, end - start + 1);
                sum -= nums[start];
                start ++;
            }
            end ++;
        }
        return maxLength == Integer.MAX_VALUE ? 0 : maxLength;
    }
}
