import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class W6P1 {

    public static void bfs(int curr, List<List<Integer>> adj, boolean[] vis, ArrayList<Integer> ans, int dest) {
        Queue<Integer> q = new LinkedList<>();
        vis[curr] = true;
        q.add(curr);
        while(!q.isEmpty()) {
            int node = q.peek();
            ans.add(node);
            q.remove();
            if(node == dest) {
                System.out.println("Path exist!!");
                return;
            }
            for(int it : adj.get(node)) {
                if(!vis[it]) {
                    vis[it] = true;
                    q.add(it);
                } 
            }
        }
    }

    // public static void dfs(int curr, List<List<Integer>> adj, boolean[] vis, ArrayList<Integer> ans, int dest) {
    //     vis[curr] = true;
    //     ans.add(curr);
    //     for(int it : adj.get(curr)) {
    //         if(!vis[it]) {
    //             dfs(it, adj, vis, ans);
    //         }
    //     }
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of vertex: ");
        int V = sc.nextInt();
        System.out.println("Enter the adj matrix: ");
        int[][] graph = new int[V][V];
        for(int i = 0; i <V; i++) {
            for(int j = 0; j < V; j++) {
                graph[i][j] = sc.nextInt();  // if node b/w i&g -> 1 else 0
            }
        }
        int dest = sc.nextInt();
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < V; i++) {
            for(int j = 0; j < V; j++) {
                if(graph[i][j] == 1) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                } 
            }
        }
        boolean[] vis = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < V; i++) {
            if(!vis[i]) {
                // dfs(i, adj, vis, ans, dest);
                bfs(i, adj, vis, ans, dest);
            }
        }
        for(int it : ans) {
            System.out.print(it + " ");
        }
    }
}