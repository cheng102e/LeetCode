package LeetCode.Q300;

import java.util.Stack;

/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/25 10:58
 */
public class Q232 {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public void MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }


    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean empty() {
        if (s1.isEmpty() && s2.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
