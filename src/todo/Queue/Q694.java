package todo.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Q694 {
    public String predictPartyVictory(String senate) {
        // 队列表示投票权，序号表示投票优先级
        Queue<Integer> radiants = new LinkedList<>();
        Queue<Integer> dires = new LinkedList<>();
        int n = senate.length();
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiants.offer(i);
            } else {
                dires.offer(i);
            }
        }

        // 只有一个阵营的队列为空了，说明这个阵营所有参议院都失去权力了，另一个阵营获胜
        while (!radiants.isEmpty() && !dires.isEmpty()) {
            // 高优先级先ban，且会ban对方最先一个，之后重置优先级
            if (radiants.peek() < dires.peek()) {
                aciton(radiants, dires, n);
            } else {
                aciton(dires, radiants, n);
            }
        }
        return radiants.isEmpty() ? "Dire" : "Radiant";

    }

    private void aciton(Queue<Integer> q1, Queue<Integer> q2, int n) {
        q2.poll();
        q1.offer(q1.poll() + n);
    }

}
