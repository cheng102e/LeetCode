package todo.Array;

public class Q977 {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length -1 ;
        int index = nums.length - 1;
        while (index >= 0) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                result[index] = nums[right] * nums[right];
                right--;
            } else {
                result[index] = nums[left] * nums[left];
                left++;
            }
            index--;
        }
        return result;
    }

    public static void main(String[] args) {
//        removeDuplicates(new int[]{1,1,2});
    }
}
