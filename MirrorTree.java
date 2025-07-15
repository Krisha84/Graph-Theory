// Give the root of a binary tree, check whether it is a mirror of itself (i.e, symmatric around its center)

import java.util.*;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}

public class MirrorTree{

    public static Node buildTree(Integer[] arr){
        
        if(arr.length == 0 || arr[0] == null){
            return null;
        }

        Node root = new Node(arr[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;

        while(i < arr.length){
            Node current = queue.poll();

            if(i < arr.length && arr[i] != null){
                current.left = new Node(arr[i]);
                queue.add(current.left);
            }
            i++;

            if(i < arr.length && arr[i] != null){
                current.right = new Node(arr[i]);
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

    public static void isMirror(Node root){

        if(root == null){
            System.out.println("Tree is a mirror of itself !!");
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root.left);
        q.add(root.right);

        while(!q.isEmpty()){
            Node t1 = q.poll();
            Node t2 = q.poll();

            if(t1 == null && t2 == null){
                continue;
            }

            if(t1 == null || t2 == null){
                System.out.println("Tree is not a mirror of itself !!");
                return;
            }

            if(t1.data != t2.data){
                System.out.println("Tree is not a mirror of itself !!");
                return;
            }

            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }

        System.out.println("Tree is a mirror of itself !!");
        return;
    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of nodes : ");
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];

        System.out.println("Enter the value in node : ");
        for(int i = 0; i < n; i++){
            System.out.println("arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("^----------^");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\n^----------^");

        Node root = buildTree(arr);
        isMirror(root);
    }
}