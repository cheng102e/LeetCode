package LeetCode.Q100;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/14 20:35
 */
public class Q75 {

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        int index0 = 0, index1 = 0, index2 = nums.length - 1;
        // 每次只需要推index1，表示当前数字
        while (index1 <= index2) {
            if (nums[index1] == 0) {
                // 0 放到最前，index0存的一定是0，推进；index1的是1或0，推进
                swap(nums, index0++, index1++);
            } else if (nums[index1] == 1) {
                // 1 就继续推进
                index1++;
            } else if (nums[index1] == 2) {
                // 2 放到末尾，index1可能为其他值，需要再判断一下
                swap(nums, index1, index2--);
            }
        }
    }
}
