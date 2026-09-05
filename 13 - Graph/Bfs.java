import java.util.*;

public class Bfs {

    public static void main(String[] args) {

        int[][] graph = {
            {0, 1, 1},
            {1, 0, 1},
            {1, 1, 0}
        };

        boolean[] visited = new boolean[3];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {

            int node = q.poll();
            System.out.print(node + " ");

            for (int i = 0; i < 3; i++) {

                if (graph[node][i] == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}