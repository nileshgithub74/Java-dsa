public class FloydWarshallALog {

    static int INF = Integer.MAX_VALUE;
    int V;
    int[][] graph;

    public FloydWarshallALog(int[][] inputGraph) {
        this.graph = inputGraph;
        this.V = graph.length;
    }

    public  void  FloydWarshall() {
        
        int[][] cost = new int[V][V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                cost[i][j] = graph[i][j];

            }
        }

        for (int k = 0; k < V; k++) {
            for (int u = 0; u < V; u++) {
                for (int v = 0; v < V; v++) {
                    if (cost[u][k] != INF && cost[k][v] != INF &&
                            cost[u][v] > cost[u][k] + cost[k][v]) {

                        cost[u][v] = cost[u][k] + cost[k][v];

                    }
                }
            }
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.err.print(cost[i][j] + " ");  
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int  V = 4;
           int[][] graph = {
            {0,   3,   INF, 7},
            {8,   0,   2, INF},
            {INF, 1,   0,   INF},
            {INF, INF, 2,   0}
        };

        FloydWarshallALog fd = new FloydWarshallALog(graph);
        fd.FloydWarshall();

       



    }

}
