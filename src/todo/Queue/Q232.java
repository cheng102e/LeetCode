package todo.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q232 {
    Deque<Integer> inStack;
    Deque<Integer> outStack;

    public void MyQueue() {
        // 提交时取消void
        inStack = new ArrayDeque<>();
        outStack = new ArrayDeque<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if(outStack.isEmpty()){
            while (!inStack.isEmpty()){
                outStack.push(inStack.peek());
                inStack.pop();
            }
        }
        int result = outStack.peek();
        outStack.pop();
        return result;
    }

    public int peek() {
        int result = pop();
        outStack.push(result);
        return result;
    }

    public boolean empty() {
        return inStack.isEmpty()&&outStack.isEmpty();
    }
}
