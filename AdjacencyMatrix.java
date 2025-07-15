import java.util.*;

public class AdjacencyMatrix{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        int[][] arr = {{0,1}, {1,2}, {1,3}, {2,3}, {3,0}};

        int vertex = 4;

        String[] str = new String[vertex];

        for(int i=0; i<vertex; i++){
            str[i] = i + "->";
        }   

        for(int i=0; i<arr.length; i++){
            int v1 = arr[i][0];
            int v2 = arr[i][1];

            str[v1] += v2 + " ";
        }

        for(int i=0 ; i<str.length; i++){
            System.out.println(str[i]);
        }
    } 
}

// System.out.println("Adjacency :");
// for (int i = 0; i < arr.length; i++) {
//     int v1 = arr[i][0];
//     int v2 = arr[i][1];
//     System.out.println(v1 + "->" + v2);
// }  