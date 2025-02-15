package todo.Array;

public class Q605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] flower = new int[flowerbed.length + 2];

        System.arraycopy(flowerbed, 0, flower, 1, flowerbed.length);
        // 直接贪心算法
        int count = 0;
        for (int i = 1; i < flower.length - 1; i++) {
            if (flower[i] == 0) {
                if (flower[i - 1] == 0 && flower[i + 1] == 0) {
                    flower[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }
}
