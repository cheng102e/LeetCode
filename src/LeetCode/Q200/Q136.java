package LeetCode.Q200;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/1/4 10:15
 */
public class Q136 {

    public static int singleNumber(int[] nums) {
        int single = 0;
        // 相同数异或为0，0异或其他为原数
        for (int num : nums) {
            single = single ^ num;
        }
        return single;
    }

}
