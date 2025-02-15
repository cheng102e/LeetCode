package LeetCode.Q1000;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020/2/2 20:07
 */
public class Q796 {

    public boolean rotateString(String s, String goal) {
        String ss = s + s;
        if (ss.contains(goal) && (s.length() == goal.length())) {
            return true;
        } else {
            return false;
        }
    }
}
