import java.util.*;

public class KruskalAlgo{

    static int find(int[] parent, int i){
        if (parent[i] == i)
            return i;
        return parent[i] = find(parent, parent[i]);
    }

    static void union(int[] parent, int u, int v){
        u = find(parent, u);
        v = find(parent, v);
        parent[u] = parent[v];
    }

    public static void main(String [] args){

        int[][] inputEdges = { 
                            {0,1,5}, 
                            {0,3,10}, 
                            {0,5,4}, 
                            {1,2,11}, 
                            {3,5,3},
                            {4,5,6},
                            {2,5,2},
                            {2,6,1} 
                        };

        int nodes = 7;

        Arrays.sort(inputEdges, (a,b) -> a[2] - b[2]);

        int[] parent = new int[nodes];

        for(int i = 0; i < nodes; i++){
            parent[i] = i;
        }

        int totalCost = 0;

        for (int[] edge : inputEdges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];

            int uParent = find(parent, u);
            int vParent = find(parent, v);

            if (uParent != vParent) {
                System.out.println(u + "-" + v + " : " + weight);
                totalCost += weight;
                union(parent, uParent, vParent);
            }
        }

        System.out.println("Total : " + totalCost);

    }    
}