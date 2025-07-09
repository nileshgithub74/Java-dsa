import java.util.*;

class PrimMST {
    static class Edge {
        int to, weight;
        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static class Pair implements Comparable<Pair> {
        int vertex, weight;
        Pair(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }

        public int compareTo(Pair other) {
            return this.weight - other.weight;
        }
    }

    public static int primMST(int V, List<List<Edge>> graph) {
        boolean[] visited = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.offer(new Pair(0, 0)); // Start from node 0 with weight 0

        int mstWeight = 0;

        while (!pq.isEmpty()) {
            Pair current = pq.poll();
            int u = current.vertex;

            if (visited[u]) continue;

            visited[u] = true;
            mstWeight += current.weight;

            for (Edge edge : graph.get(u)) {
                if (!visited[edge.to]) {
                    pq.offer(new Pair(edge.to, edge.weight));
                }
            }
        }

        return mstWeight;
    }

    public static void main(String[] args) {
        int V = 5; // number of vertices

        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges (undirected)
        graph.get(0).add(new Edge(1, 2));
        graph.get(1).add(new Edge(0, 2));

        graph.get(0).add(new Edge(3, 6));
        graph.get(3).add(new Edge(0, 6));

        graph.get(1).add(new Edge(2, 3));
        graph.get(2).add(new Edge(1, 3));

        graph.get(1).add(new Edge(3, 8));
        graph.get(3).add(new Edge(1, 8));

        graph.get(1).add(new Edge(4, 5));
        graph.get(4).add(new Edge(1, 5));

        graph.get(2).add(new Edge(4, 7));
        graph.get(4).add(new Edge(2, 7));

        int result = primMST(V, graph);
        System.out.println("Total weight of MST: " + result);
    }
}
