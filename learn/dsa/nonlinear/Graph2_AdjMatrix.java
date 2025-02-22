package learn.dsa.nonlinear;

import java.util.Scanner;

public class Graph2_AdjMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // number of nodes
        int e = scanner.nextInt(); // number of edges

        int[][] adj = new int[n+1][n+1];

        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                adj[i][j] = 0;
            }
        }

        //Input Edges
        for(int i=1; i<=e; i++){
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            adj[u][v] = 1;
            adj[v][u] = 1;
        }

        //Display nodes
        for(int i=1; i<=n; i++){
            System.out.println();
            System.out.print("Nodes adjacent to " + i + " are ");

            for(int j=0; j<=n; j++){
                if(adj[i][j] == 1){
                    System.out.print(j + " ");
                }
            }
        }

        scanner.close();
    }
}
