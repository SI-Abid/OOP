import java.util.PriorityQueue;
import java.util.Scanner;
// import java.io.File;
import java.util.Arrays;

class Node {
    int u;
    int cost;
    Node(int u, int cost) {
        this.u = u;
        this.cost = cost;
    }
    // public boolean lessthan(Node that) {
    //     return this.cost < that.cost;
    // }
}

class Dijstkra {
    public static void spt(int n, int[] adj[], int[] cost[], int s) {
        int[] distance = new int[n+1];
        Arrays.fill(distance, Integer.MAX_VALUE);

        PriorityQueue <Node> pq = new PriorityQueue<Node>();
        pq.add(new Node(s, 0));
        distance[s] = 0;

        while (!pq.isEmpty()) {
            Node top = pq.poll();
            int u = top.u;

            for(int i = 0; i < adj[u].length; i++) {
                int v = adj[u][i];

                if (distance[v] > distance[u] + cost[u][i]) {
                    distance[v] = distance[u] + cost[u][i];
                    pq.add(new Node(v, distance[v]));
                }
            }
        }
        for(int i = 1; i <= n; i++) {
            System.out.println(s+"-->"+distance[i]);
        }
    }
}


public class J_xxv {
    public static void main(String[] args) {
        // File file = new File(System.in);
        try {
            Scanner scanner = new Scanner(System.in);
            int node = scanner.nextInt();
            int edge = scanner.nextInt();
            
            int[][] adj = new int[node+1][node+1];
            int[][] cost = new int[node+1][node+1];

            for(int i = 0; i < edge; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                int w = scanner.nextInt();
                adj[u][v] = 1;
                adj[v][u] = 1;  
                cost[u][v] = w;
                cost[v][u] = w;
            }
            int s = 0;
            Dijstkra.spt(node, adj, cost, s);

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
