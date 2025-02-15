package todo.Greedy;

import java.util.stream.IntStream;

public class Q1005 {
    public static int largestSumAfterKNegations(int[] nums, int k) {
        nums = IntStream.of(nums)
                .boxed()
                .sorted((num1, num2) -> Math.abs(num2) - Math.abs(num1))
                .mapToInt(Integer::intValue)
                .toArray();
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] >= 0) {
                sum += nums[i];
            } else {
                if (k > 0) {
                    sum -= nums[i];
                    k--;
                } else {
                    sum += nums[i];
                }
            }
        }
        if (k > 0 && k % 2 != 0) {
            sum -= nums[nums.length - 1];
        } else {
            sum += nums[nums.length - 1];
        }
        return sum;
    }

    public static void main(String[] args) {
        largestSumAfterKNegations(new int[]{2, -3, -1, 5, -4}, 2);
    }
}
