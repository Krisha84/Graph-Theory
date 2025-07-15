import java.util.*;

public class BFS {
    public static void main(String[] args) {
        int[][] adj = {{1, 2}, {0, 2, 3}, {0, 1, 4}, {1, 4}, {2, 3}};

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[5];

        int start = 0;
        visited[start] = true;
        queue.add(start);

        System.out.println("BFS Traversal : ");

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int i = 0; i < adj[node].length; i++) {
                int next = adj[node][i];

                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }
}
