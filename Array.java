import java.util.*;
public class Array{
    public static void main (String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
			System.out.println("Enter an element into array["+i+"] : ");
			arr[i] = sc.nextInt();
		}

        System.out.println("---Array---");

        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }

        int max = arr[0];

        for(int i=1; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("---Maximum Value---");
        System.out.println(max);

        int min = arr[0];

        for(int i=1; i<n; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println("---Minimum Value---");
        System.out.println(min);

    }
}