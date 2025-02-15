package LeetCode.Q100;

import java.util.*;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/4/24 16:32
 */
public class Q18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>> all = new HashSet<>();
        ArrayList<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        if (n < 4) {
            return ans;
        }
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int sum = nums[i] + nums[j];
                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    int tmpsum = sum + nums[left] + nums[right];
                    if (tmpsum == target) {
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[left++]);
                        tmp.add(nums[right--]);
                        tmp.sort(new Comparator<Integer>() {
                            @Override
                            public int compare(Integer o1, Integer o2) {
                                return o1 - o2;
                            }
                        });
                        all.add(tmp);
                    } else if (tmpsum < target) {
                        left++;
                    } else {
                        right--;
                    }
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
