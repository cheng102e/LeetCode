package todo.Array;

import java.util.Arrays;
import java.util.HashMap;

public class Q2300 {
    public static void main(String[] args) {
        successfulPairs(new int[]{5,1,3},new int[]{1,2,3,4,5},7);
    }
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int[] result = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(spells[i])) {
                result[i] = map.get(spells[i]);
            } else {
                long target = (success + spells[i] - 1) / spells[i] - 1;
                int index = binarySearch(potions, 0, potions.length - 1, target);
                int count = potions.length - index;
                result[i] = count;
                map.put(spells[i], count);
            }
        }

        return result;
    }

    public static int binarySearch(int[] potions, int left, int right, long target) {
        int result = right + 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (potions[mid] > target) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

}
