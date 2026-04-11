import java.util.*;

public class BFSGraph {
    private Map<Integer, List<Integer>> adj = new HashMap<>();

    public void addEdge(int u, int v) {
        adj.putIfAbsent(u, new ArrayList<>());
        adj.get(u).add(v);
        adj.putIfAbsent(v, new ArrayList<>());
        adj.get(v).add(u); // For undirected graph
    }

    public void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int neighbor : adj.get(node)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFSGraph g = new BFSGraph();

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(5, 8);

        System.out.print("BFS Traversal: ");
        g.bfs(0);
    }
}
