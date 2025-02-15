package LeetCode;

import LeetCode.Q2000.Q1011;
import org.junit.jupiter.api.Test;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/6 23:26
 */
class QTest {

    @Test
    void shipWithinDays() {
        int[] piles = piles = new int[]{1,2,3,4,5,6,7,8,9,10};
        int H = 5;
        System.out.println(Q1011.shipWithinDays(piles, H));
    }
}