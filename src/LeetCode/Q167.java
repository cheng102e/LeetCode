package LeetCode;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/31 11:28
 */
public class Q167 {

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                int[] ans = new int[2];
                ans[0] = left + 1;
                ans[1] = right + 1;
                return ans;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }

}
