import java.util.*;
public class ArraySub{
    public static void main (String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of row : ");
        int n = sc.nextInt();
        System.out.println("Enter the number of column : ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Eneter elements into arr : ");

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println("["+i+"]["+j+"] : ");
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] arr1 = new int[n][m];
        
        System.out.println("Eneter elements into arr1 : ");

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.println("["+i+"]["+j+"] : ");
                arr1[i][j] = sc.nextInt();
            }
        }

        int[][] arr3 = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr3[i][j] = arr[i][j] - arr1[i][j];
            }
        }

        System.out.println("--Array_1--");

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("--Array_2--ssssss");

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("--Substraction of two array--");

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println("");
        }
    }
}