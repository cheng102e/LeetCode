package LeetCode.Q1000;

import java.util.HashMap;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/4/28 20:39
 */
public class Q904 {
    public static int totalFruit(int[] fruits) {
        int sum = 0;
        int max = 0;
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < fruits.length; i++) {
            map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);
            sum++;
            while (map.size() > 2) {
                int num = map.get(fruits[left]);
                if (num == 1) {
                    map.remove(fruits[left]);
                } else {
                    map.put(fruits[left], map.get(fruits[left]) - 1);
                }
                sum--;
                left++;
            }
            max = Math.max(sum, max);
        }
        return max;
    }

}
