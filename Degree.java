import java.util.*;

public class Degree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int vertex = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int edge = sc.nextInt();

        int[][] arr = new int[edge][2];

        System.out.println("Enter each edge (from to) :");
        for (int i = 0; i < edge; i++) {
            System.out.println("For edge " + (i + 1));
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt(); 
        }

        String[] str = new String[vertex];

        int[] inDegree = new int[vertex];
        int[] outDegree = new int[vertex];

        for (int i = 0; i < vertex; i++) {
            str[i] = i + "->";
        }

        for (int i = 0; i < edge; i++) {
            int v1 = arr[i][0];
            int v2 = arr[i][1];

            str[v1] += v2 + " ";

            outDegree[v1]++;    
            inDegree[v2]++;
        }

        System.out.println("Adjacency List :");
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

        System.out.println("In-Degree and Out-Degree :");
        for (int i = 0; i < vertex; i++) {
            System.out.println("Vertex " + i + " => Out-Degree: " + outDegree[i] + ", In-Degree: " + inDegree[i]);
        }

        sc.close();
    }
}