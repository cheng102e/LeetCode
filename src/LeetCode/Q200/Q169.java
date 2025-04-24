package LeetCode.Q200;

public class Q169 {

    public static int majorityElement(int[] nums) {
        // 记录当前数出现次数
        int count = 0;
        int temp = nums[0];
        for (int num : nums) {
            // 若和数相同则+1，不同-1，答案出现次数一定大于等于一半
            if (count == 0) {
                temp = num;
                count = 1;
            } else if (num == temp) {
                count++;
            } else {
                count--;
            }
        }
        return temp;
    }

}
