package todo.Array;

import java.util.HashMap;

public class Q904 {
    public static int totalFruit(int[] fruits) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (end < fruits.length) {
            map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);
            while (map.size() > 2) {
                if (map.get(fruits[start]) > 1) {
                    map.put(fruits[start], map.get(fruits[start]) - 1);
                } else {
                    map.remove(fruits[start]);
                }
                start++;
            }
            maxLength = Math.max(end - start + 1, maxLength);
            end++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        totalFruit(new int[]{0, 1, 2, 2});
    }
}
