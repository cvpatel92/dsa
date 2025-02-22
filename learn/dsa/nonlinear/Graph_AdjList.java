package learn.dsa.nonlinear;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph_AdjList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many number of nodes or vertices does the graph have?");
        int n = scanner.nextInt();

        System.out.println("How many number of Edges does the graph have?");
        int e = scanner.nextInt();

        //Create Adjacency list with the size of number of node in graph

        List<List<Integer>> adj = new ArrayList<>(n);

        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        //Read edges and fill the adjacency list

        for(int i=0; i<e; i++){
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        //print the adjacency list

        for(int i=0; i<n; i++){
            System.out.println();
            System.out.print("Nodes adjacent to " + i + " are ");
            for(int x : adj.get(i)){
                System.out.println(x + " ");
            }
        }

        scanner.close();
    }
}
