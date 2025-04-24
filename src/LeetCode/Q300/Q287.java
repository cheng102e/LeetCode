package LeetCode.Q300;

public class Q287 {
    public int findDuplicate(int[] nums) {
        // 存在环，故使用快慢指针
        int slow = 0;
        int fast = 0;
        // 根据序号，快走两步
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        // 现在快慢重新相遇，将快指针放回开始
        fast = 0;
        // 再次相遇即为入口
        do {
            slow = nums[slow];
            fast = nums[fast];
        } while (fast != slow);
        return slow;

    }

}
