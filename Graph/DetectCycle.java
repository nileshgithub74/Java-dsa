import java.util.ArrayList;

public class DetectCycle {

    // DFS-based function to detect cycle
    boolean Cycledetect(int start, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {

        visited[start] = true;

        for (int i = 0; i < adj.get(start).size(); i++) {
            int neighbor = adj.get(start).get(i);

            // Skip the edge leading to parent
            if (neighbor == parent) {
                continue;
            }

            // If neighbor is visited and not parent, cycle is found
            if (visited[neighbor]) {
                return true;
            }

            // Recur for unvisited neighbors
            if (Cycledetect(neighbor, start, adj, visited)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int V = 5;  // number of vertices
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Example graph
        // 0--1
        // |  |
        // 4--2
        // |
        // 3

        adj.get(0).add(1);
        adj.get(1).add(0);

        adj.get(0).add(4);
        adj.get(4).add(0);

        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(4).add(2);
        adj.get(2).add(4);

        adj.get(4).add(3);
        adj.get(3).add(4);

        boolean[] visited = new boolean[V];
        DetectCycle dc = new DetectCycle();

        boolean hasCycle = false;
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dc.Cycledetect(i, -1, adj, visited)) {
                    hasCycle = true;
                    break;
                }
            }
        }

        if (hasCycle) {
            System.out.println("Cycle detected in the graph.");
        } else {
            System.out.println("No cycle in the graph.");
        }
    }
}
