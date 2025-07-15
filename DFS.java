import java.util.*;

public class DFS {
    public static void main(String[] args) {
        int[][] adj = {{1, 2}, {0, 2, 3}, {0, 1, 4}, {1, 4}, {2, 3}};

        boolean[] visited = new boolean[5];
        Stack<Integer> stack = new Stack<>();

        int start = 0;
        stack.push(start);

        System.out.println("DFS Traversal : ");

        while (!stack.isEmpty()) {
            int node = stack.pop();

            if (!visited[node]) {
                visited[node] = true;
                System.out.print(node + " ");

                for (int i = adj[node].length - 1; i >= 0; i--) {
                    int next = adj[node][i];
                    if (!visited[next]) {
                        stack.push(next);
                    }
                }
            }
        }
    }
}