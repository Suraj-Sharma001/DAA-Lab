import java.util.*;

public class W6P2 {

    // DFS function to color the graph
    public static boolean dfs(int curr, int col, int[] color, List<List<Integer>> adj) {
        color[curr] = col;  // Color the current node
        for (int neighbor : adj.get(curr)) {
            if (color[neighbor] == -1) { // If the neighbor hasn't been colored
                // Recursively color the neighbor with the opposite color
                if (!dfs(neighbor, 1 - col, color, adj)) return false;
            } else if (color[neighbor] == col) { // If the neighbor has the same color
                return false; // Conflict found
            }
        }
        return true; // No conflicts found
    }

    // Function to check if the graph is bipartite
    public static boolean isBipartite(int V, List<List<Integer>> adj) {
        int[] color = new int[V];
        Arrays.fill(color, -1); // Initialize all vertices as uncolored
        for (int i = 0; i < V; i++) {
            if (color[i] == -1) { // If the vertex is uncolored
                if (!dfs(i, 0, color, adj)) return false; // Start DFS with color 0
            }
        }
        return true; // All vertices can be colored without conflict
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int V = sc.nextInt();
        System.out.println("Enter the adjacency matrix: ");
        int[][] graph = new int[V][V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                graph[i][j] = sc.nextInt();  // 1 if there is an edge between i and j, else 0
            }
        }

        // Create adjacency list from the adjacency matrix
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (graph[i][j] == 1) {
                    adj.get(i).add(j);
                }
            }
        }

        // Check if the graph is bipartite
        boolean ans = isBipartite(V, adj);
        System.out.println(ans ? "Yes" : "No");
    }
}