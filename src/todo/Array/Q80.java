package todo.Array;

public class Q80 {
    public static void main(String[] args) {
        removeDuplicates(new int[]{0,0,1,1,1,2,3,3});
    }
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int index = 2;
        int length = 2;
        for (int i = 2; i < n; i++) {
            if (nums[i] != nums[index-2]) {
                nums[index++] = nums[i];
                length++;
            }
        }
        return length;
    }
}
