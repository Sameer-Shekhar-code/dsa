package CoreJava.StaticMembers;

import java.io.*;
import java.util.*;

public class EscapeTheIsland {
    static class Edge {
        int to, weight;
        Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    static class Node implements Comparable<Node> {
        int vertex, dist;
        Node(int vertex, int dist) {
            this.vertex = vertex;
            this.dist = dist;
        }
        public int compareTo(Node other) {
            return Integer.compare(this.dist, other.dist);
        }
    }

    // Standard Dijkstra
    static int[] dijkstra(int N, List<List<Edge>> graph, int start) {
        int[] dist = new int[N + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));
        boolean[] visited = new boolean[N + 1];

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            int u = cur.vertex;
            if (visited[u]) continue;
            visited[u] = true;

            for (Edge e : graph.get(u)) {
                if (dist[u] + e.weight < dist[e.to]) {
                    dist[e.to] = dist[u] + e.weight;
                    pq.add(new Node(e.to, dist[e.to]));
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ");
        int N = Integer.parseInt(first[0]);
        int M = Integer.parseInt(first[1]);

        // Graph construction
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < M; i++) {
            String[] parts = br.readLine().split(" ");
            int u = Integer.parseInt(parts[0]);
            int v = Integer.parseInt(parts[1]);
            int w = Integer.parseInt(parts[2]);
            graph.get(u).add(new Edge(v, w));
            graph.get(v).add(new Edge(u, w)); // undirected
        }

        String[] last = br.readLine().split(" ");
        int S = Integer.parseInt(last[0]);
        int V = Integer.parseInt(last[1]);

        int[] distFromS = dijkstra(N, graph, S);
        int[] distFromV = dijkstra(N, graph, V);

        List<Integer> safeNodes = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (distFromS[i] == Integer.MAX_VALUE) continue; // unreachable from S
            if (distFromV[i] == Integer.MAX_VALUE || distFromS[i] < distFromV[i]) {
                if (i != V) safeNodes.add(i); // volcano node unsafe
            }
        }

        if (safeNodes.isEmpty()) {
            System.out.println("None");
        } else {
            Collections.sort(safeNodes);
            for (int x : safeNodes) System.out.print(x + " ");
            System.out.println();
        }
    }
}
