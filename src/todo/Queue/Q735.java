package todo.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Q735 {
    public int[] asteroidCollision(int[] asteroids) {

        Deque<Integer> deque = new LinkedList<>();

        for (int asteroid : asteroids) {
            if (deque.isEmpty() || asteroid > 0) {
                // 为空直接入栈,向右飞也是
                deque.offerLast(asteroid);
            } else if (asteroid < 0) {
                if (deque.peekLast() < 0) {
                    deque.offerLast(asteroid);
                } else {
                    boolean alive = true;
                    while (!deque.isEmpty() && deque.peekLast()>0) {
                        int top = deque.pollLast();
                        if (top + asteroid > 0) {
                           asteroid = top;
                            break;
                        } else if (top + asteroid == 0) {
                            alive = false;
                            break;
                        }
                    }
                    if (alive) {
                        deque.offerLast(asteroid);
                    }
                }
            }
        }
        int size = deque.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = deque.pollFirst();
        }
        return result;
    }
}
