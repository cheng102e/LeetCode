package todo.Array;

public class Q26 {
    public static int removeDuplicates(int[] nums) {
        int slow = 1;
        int fast = 1;
        int tag = nums[0];
        while (fast < nums.length) {
            if (nums[fast] != tag) {
                tag = nums[fast];
                nums[slow] = tag;
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{1, 1, 2});
    }
}
