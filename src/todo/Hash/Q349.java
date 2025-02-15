package todo.Hash;

import java.util.HashSet;

public class Q349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> answer = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                answer.add(i);
            }
        }
        int[] result = new int[answer.size()];
        int index = 0;
        for (int num : answer) {
            result[index++] = num;
        }
        return result;
    }
}
