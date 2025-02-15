package todo.Array;

public class Q441 {
    public static int arrangeCoins(int n) {
        // 左闭右闭
        int left = 1;
        int right = n;
        // 跳出边界
        while (left < right) {
            int mid = (right - left + 1) / 2 + left;
            if ((long) mid * (mid + 1) <= (long) 2 * n) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        arrangeCoins(5);
    }
}
