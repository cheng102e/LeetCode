package LeetCode;

import java.util.Stack;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/25 15:40
 */
public class Q1541 {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        int need = 0;
        int ans = 0;
        for (char c : ch) {
            if (c == '(') {
                need+=2;
                if(need%2==1){
                    ans++;
                    need--;
                }
            }else {
                need--;
                if(need==-1){
                    ans++;
                    need=1;
                }
            }
        }
        return ans + need;
    }
}
