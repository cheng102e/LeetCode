package todo.Array;

public class Q169 {
    public static int majorityElement(int[] nums) {
        int count = 1;
        int now = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                now = nums[i];
                count++;
            } else if (nums[i] == now) {
                count++;
            } else if (nums[i] != now) {
                count--;
            }
        }
        return now;
    }

    public static void main(String[] args) {
        majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
    }
}
