import java.util.*;

public class FriendCircle{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of person : ");
        int n = sc.nextInt();

        int[][] adj = new int[n][n];

        System.out.println();
        System.out.println("Enter adjacancy matrix : ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println("adj["+i+"]["+j+"] : ");
                adj[i][j] = sc.nextInt();
            }
        }

        boolean[] visited = new boolean[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs(adj, visited, i);
                count++;
            }
        }

        System.out.println();
        System.out.println("Total no of Frd Circle : "+ count);
    }

    public static void dfs(int[][] adj, boolean[] visited, int person){
        visited[person] = true;

        for(int i = 0; i < adj.length; i++){
            if(adj[person][i] == 1 && !visited[i]){
                dfs(adj, visited, i);
            }
        }
    } 
}       