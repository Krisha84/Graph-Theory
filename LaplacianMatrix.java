import java.util.*;

public class LaplacianMatrix{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vertices : ");
        int n = sc.nextInt();

        System.out.println("Enter the number of edges : ");
        int e = sc.nextInt();

        int[][] arr = new int[e][2];

        System.out.println("Enter each edge (from to) :");
        for (int i = 0; i < e; i++) {
            System.out.println("For edage "+(i+1));
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        int[][] adjMatrix = new int[n][n];
        int[][] degreeMatrix = new int[n][n];
        int[][] laplacianMatrix = new int[n][n];

        int sum = 0;

        for(int i = 0; i < e; i++){
            int x = arr[i][0] - 1;
            int y = arr[i][1] - 1;

            adjMatrix[x][y] = 1;
            adjMatrix[y][x] = 1;
        }

        System.out.println("---Adjacency Matrix---");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < n; i ++){
            for(int j = 0; j < n; j++){
                sum = sum + adjMatrix[i][j];
                degreeMatrix[i][i] = sum;
            }
            sum = 0;
        }

        System.out.println("---Degree Matrix---");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(degreeMatrix[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                laplacianMatrix[i][j] = degreeMatrix[i][j] - adjMatrix[i][j];
            }
        }

        System.out.println("---Laplacian Matrix---");

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(laplacianMatrix[i][j] >= 0){
                    System.out.print("  " + laplacianMatrix[i][j]);
                }
                else{
                   System.out.print(" " + laplacianMatrix[i][j]); 
                }
  
            }
            System.out.println();
        }

    }
}