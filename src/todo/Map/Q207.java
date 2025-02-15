package todo.Map;

import java.util.LinkedList;
import java.util.Queue;

public class Q207 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegrees = new int[numCourses];
        int[][] adjacecy = new int[numCourses][numCourses];
        Queue<Integer> queue = new LinkedList<>();
        int exist = numCourses;
        for (int[] cp : prerequisites) {
            // 更新入度与矩阵
            int inNode = cp[0];
            int outNode = cp[1];
            indegrees[inNode]++;
            adjacecy[outNode][inNode]++;
        }
        // 入度为0，可以开始
        for (int i = 0; i < numCourses; i++) {
            if (indegrees[i] == 0) {
                queue.add(i);
            }
        }
        while (!queue.isEmpty()) {
            // 代表该课已上完
            int pre = queue.poll();
            exist--;
            for (int i = 0; i < numCourses; i++) {
                if (adjacecy[pre][i] == 1) {
                    indegrees[i]--;
                    if (indegrees[i] == 0) {
                        queue.add(i);
                    }
                }
            }
        }

        return exist == 0;
    }
}
