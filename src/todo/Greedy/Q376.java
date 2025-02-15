package todo.Greedy;

public class Q376 {
    public static int wiggleMaxLength(int[] nums) {
        int pre = 0;
        int length = 1;
        for(int i = 1;i<nums.length;i++){
            int diff = nums[i] - nums[i-1];
            if(diff == 0){
                continue;
            }
            if(diff * pre <= 0){
                length++;
                pre = diff;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        wiggleMaxLength(new int[]{1,7,4,9,2,5});
    }
}
