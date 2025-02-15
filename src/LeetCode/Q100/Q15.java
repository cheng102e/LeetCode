package LeetCode.Q100;

import java.util.*;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/4/24 16:31
 */
public class Q15 {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> all = new HashSet<>();
        ArrayList<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        if (n < 3) {
            return ans;
        }
        for (int i = 0; i < n - 2; i++) {
            int sum = nums[i];
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int tmpsum = sum + nums[left] + nums[right];
                if (tmpsum == 0) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(sum);
                    tmp.add(nums[left++]);
                    tmp.add(nums[right--]);
                    all.add(tmp);
                } else if (tmpsum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        Iterator<List<Integer>> iterator = all.iterator();
        while (iterator.hasNext()) {
            ans.add(iterator.next());
        }
        return ans;
    }
}
