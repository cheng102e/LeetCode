package todo.Array;

public class Q724 {
    public int pivotIndex(int[] nums) {
        // 构成前缀和数组
        for (int i = 1;i<nums.length;i++){
            nums[i] += nums[i-1];
        }
        int sum = nums[nums.length-1];
        if(sum == nums[0]){
            return 0;
        }
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1] + nums[i] == sum){
                return i;
            }
        }

        return -1;
    }
}
