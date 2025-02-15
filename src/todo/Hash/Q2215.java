package todo.Hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int num : set1) {
            if (!set2.contains(num)) {
                result1.add(num);
            }
        }
        for (int num : set2) {
            if (!set1.contains(num)) {
                result2.add(num);
            }
        }
        result.add(result1);
        result.add(result2);
        return result;
    }
}
