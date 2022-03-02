package LeetCode;

import java.util.Stack;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-14 11:23
 */
public class Q155 {

  Stack<Integer> stackdata;
  Stack<Integer> stackmin;

 /* public MinStack() {
    stackdata = new Stack<>();
    stackmin = new Stack<>();
  }*/

  public void push(int x) {
    stackdata.push(x);

    if (stackmin.empty()) {
      stackmin.push(x);
    } else if (x < stackmin.peek()) {
      stackmin.push(x);
    } else {
      stackmin.push(stackmin.peek());
    }
  }

  public void pop() {
    if (!stackdata.empty()) {
      stackdata.pop();
      stackmin.pop();
    }
  }

  public int top() {
    return stackdata.peek();
  }

  public int getMin() {
    return stackmin.peek();
  }
}
