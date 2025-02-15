package todo.Array;

public class Q35 {
    public int searchInsert(int[] nums, int target) {
        // 左闭右闭
        int left = 0;
        int right = nums.length - 1;
        // 跳出边界
        while (left <= right) {
            int index = left + (right - left) / 2;
            if (nums[index] < target) {
                left = index + 1;
            } else if (nums[index] > target) {
                right = index - 1;
            } else {
                return index;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
