package todo.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Q225 {

    Queue<Integer> queue1;
    Queue<Integer> queue2;

    public void MyStack() {
        // 提交时删除void
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        queue1.add(x);
    }

    public int pop() {
        int size = queue1.size();
        for(int i = 0; i < size - 1; i++){
            queue2.add(queue1.poll());
        }
        int result = queue1.poll();
        queue1 = queue2;
        queue2 = new LinkedList<>();
        return result;
    }

    public int top() {
        int size = queue1.size();
        for(int i = 0; i < size - 1; i++){
            queue2.add(queue1.poll());
        }
        int result = queue1.poll();
        queue2.add(result);
        queue1 = queue2;
        queue2 = new LinkedList<>();
        return result;
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}
