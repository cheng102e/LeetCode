package todo.Hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int length = nums.length;
        for (int first = 0; first < length - 3; first++) {
            long firstNum = nums[first];
            if (first > 0 && firstNum == nums[first - 1]) {
                continue; // 跳过重复数字
            }
            if (firstNum + nums[first + 1] + nums[first + 2] + nums[first + 3] > target) {
                break; // 优化一
            }
            if (firstNum + nums[length - 3] + nums[length - 2] + nums[length - 1] < target) {
                continue; // 优化二
            }
            for (int second = first + 1; second < length - 2; second++) { // 枚举第二个数
                long secondNum = nums[second];
                if (second > first + 1 && secondNum == nums[second - 1]) {
                    continue; // 跳过重复数字
                }
                if (firstNum + secondNum + nums[second + 1] + nums[second + 2] > target) {
                    break; // 优化一
                }
                if (firstNum + secondNum + nums[length - 2] + nums[length - 1] < target) {
                    continue; // 优化二
                }
                int third = second + 1;
                int fourth = length - 1;
                while (third < fourth) { // 双指针枚举第三个数和第四个数
                    long sum = firstNum + secondNum + nums[third] + nums[fourth]; // 四数之和
                    if (sum > target) {
                        fourth--;
                    } else if (sum < target) {
                        third++;
                    } else { // s == target
                        ans.add(Arrays.asList((int) firstNum, (int) secondNum, nums[third], nums[fourth]));
                        while (third < fourth && nums[third] == nums[third + 1]) {
                            third++;
                        }
                        third++;
                        while (third < fourth && nums[fourth] == nums[fourth - 1]) {
                            fourth--;
                        }
                        fourth--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        fourSum(new int[]{0, 0, 0, 1000000000, 1000000000, 1000000000, 1000000000}, 1000000000);
    }

}
