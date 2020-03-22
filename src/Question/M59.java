package Question;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Cheng102e
 * @version 1.0
 * @date 2020-03-07 10:43
 */
public class M59 {

  private Deque<Integer> queue;
  private Deque<Integer> max;

  public void MaxQueue() {

    queue = new ArrayDeque<>();
    max = new ArrayDeque<>();
  }

  public int max_value() {
    return queue.isEmpty() ? -1 : max.peek();
  }

  public void push_back(int value) {
    queue.offer(value);
    while (!max.isEmpty() && value > max.peekLast()) {
      max.pollLast();
    }
    max.offer(value);
  }

  public int pop_front() {
    if(queue.isEmpty()) {
      return -1;
    }
    int val = queue.pop();
    if(max.peek() == val) {
      max.pop();
    }
    return val;
  }
}
