// import java.util.LinkedList;
// import java.util.Queue;

// public class Graph {
//     int V;
//     int[][] adj;

//     Graph(int V) {
//         this.V = V;
//         this.adj = new int[V][V];
//     }

//     public void addEdge(int v, int w) {
//         adj[v][w] = 1;
//         adj[w][v] = 1;
//     }

//     public void bfs(int start) {
//         boolean visited[] = new boolean[V];
//         Queue<Integer> q = new LinkedList<>();

//         q.add(start);
//         visited[start] = true;
//         while (!q.isEmpty()) {
//             int removed = q.poll();
//             System.out.print(removed + " ");

//             for (int i = 0; i<V; i++) {
//                 if (adj[removed][i] == 1 && (!visited[i])) {
//                     visited[i] = true;
//                     q.add(i);

//                 }
//             }

//         }
//         System.out.println();

//     }

//     public static void main(String[] args) {
//         Graph g = new Graph(6);

//         g.addEdge(0, 1);
//         g.addEdge(0, 3);
//         g.addEdge(1, 0);
//         g.addEdge(1, 2);
//         g.addEdge(2,1);
//         g.addEdge(2,5);
//         g.addEdge(3,0);
//         g.addEdge(3,4);
//         g.addEdge(4,3);
//         g.addEdge(4,5);
//         g.addEdge(5,2);
//         g.addEdge(5,4);

        
//         g.bfs(0);
//         g.bfs(1);
//         g.bfs(2);

//     }


// }


















public class Graph {
    int V;
    int[][] adj;

    Graph(int V) {
        this.V = V;
        this.adj = new int[V][V];
    }

    // Add undirected edge
    public void addEdge(int v, int w) {
        adj[v][w] = 1;
        adj[w][v] = 1;
    }

    // DFS utility (recursive)
    public void dfsUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int i = 0; i < V; i++) {
            if (adj[node][i] == 1 && !visited[i]) {
                dfsUtil(i, visited);
            }
        }
    }

    // Public DFS method
    public void dfs(int start) {
        boolean[] visited = new boolean[V];
        System.out.print("DFS: ");
        dfsUtil(start, visited);
    }

    public static void main(String[] args) {
        Graph g = new Graph(6); // 6 nodes: 0 to 5

        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 0);
        g.addEdge(1, 2);
        g.addEdge(2,1);
        g.addEdge(2,5);
        g.addEdge(3,0);
        g.addEdge(3,4);
        g.addEdge(4,3);
        g.addEdge(4,5);
        g.addEdge(5,2);
        g.addEdge(5,4);
        g.dfs(0);
        g.dfs(1);
        g.dfs(2);
    }
}

