package todo.Array;

public class Q31 {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        for (int i = len - 2; i >= 0; i--) {
            // 从后往前找到第一个增的序列
            if (nums[i] < nums[i + 1]) {//找到小数
                // 重新找一个较大的数，比增序列的第一个大
                for (int j = len - 1; j > i; j--) {
                    if (nums[j] > nums[i]) {
                        swap(nums, i, j);
                        //i从最小，换为第二小，序列上升，之后转置i+1到结尾，为最小序列
                        reverse(nums, i + 1, len - 1);
                        return;
                    }
                }
            }
        }
        //如果没有提前退出，那么就是没碰到逆序遍历是降序的，全是升序，说明最大了
        reverse(nums, 0, len - 1);
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    //由于nums[i] < nums[i+1]，我们可以知道，到满足这个条件的前提，是必须存在递增，
    //从后面往前，遍历了很多个才碰到第一个符合条件的，
    //那么说明从第一个符合条件开始往后，后面的肯定都是递减，是降序的，所以逆置即可最快重新排序。
    void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
