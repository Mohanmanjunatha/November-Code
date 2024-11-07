package Day8;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class GfG {

    // BFS from the given source node s
    static void bfs(List<List<Integer>> adj, int s) {

        // Step 1: Create a queue to manage the BFS process
        Queue<Integer> q = new LinkedList<>();
        // Example: Queue is empty at this point -> q = []

        // Step 2: Create a visited array to track which nodes have been visited
        boolean[] visited = new boolean[adj.size()];
        // Example: No nodes are visited initially -> visited = [false, false, false, false, false]

        // Step 3: Mark the source node 's' as visited and add it to the queue
        visited[s] = true;
        q.add(s);
        // Example: Starting BFS from node 0 -> visited = [true, false, false, false, false], q = [0]

        // Step 4: Process the queue until it's empty
        while (!q.isEmpty()) {

            // Step 5: Dequeue a vertex from the queue and process it
            int curr = q.poll();
            System.out.print(curr + " ");
            // Example: curr = 0, Output so far: "0 ", Queue after polling: q = []

            // Step 6: Get all adjacent vertices of the dequeued vertex 'curr'
            List<Integer> neighbors = adj.get(curr);
            // Example: neighbors of 0 -> [1, 2]

            // Step 7: Iterate through all neighbors of 'curr'
            for (int i = 0; i < neighbors.size(); i++) {
                int neighbor = neighbors.get(i);
                // Example: First iteration -> neighbor = 1
                //          Second iteration -> neighbor = 2

                // Step 8: Check if the neighbor has been visited
                if (!visited[neighbor]) {
                    // Step 9: If not visited, mark it as visited
                    visited[neighbor] = true;
                    // Example: Mark 1 as visited -> visited = [true, true, false, false, false]
                    //          Then mark 2 as visited -> visited = [true, true, true, false, false]

                    // Step 10: Add the neighbor to the queue for future processing
                    q.add(neighbor);
                    // Example: After adding 1 and 2 -> q = [1, 2]
                }
            }
            // End of neighbors processing for curr = 0
        }
        // BFS ends when queue is empty
    }

    // Function to add an undirected edge to the graph
    static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v); // Add v to the list for u
        adj.get(v).add(u); // Add u to the list for v (since graph is undirected)
    }

    public static void main(String[] args) {

        // Step A: Number of vertices in the graph
        int V = 5;

        // Step B: Initialize the adjacency list
        List<List<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Step C: Add edges to the graph
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 4);
        // Example Adjacency List:
        // 0 -> [1, 2]
        // 1 -> [0, 3, 4]
        // 2 -> [0, 4]
        // 3 -> [1]
        // 4 -> [1, 2]

        // Step D: Perform BFS traversal starting from vertex 0
        System.out.println("BFS starting from 0:");
        bfs(adj, 0);
        // Expected output: 0 1 2 3 4
    }
}
