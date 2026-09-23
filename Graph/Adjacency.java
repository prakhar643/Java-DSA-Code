import java.util.ArrayList;

public class Adjacency {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {

        // Initialize every ArrayList
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        // Vertex 0
        graph[0].add(new Edge(0, 1, 5));

        // Vertex 1
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // Vertex 2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // Vertex 3
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // Vertex 4
        graph[4].add(new Edge(4, 2, 2));
    }

    public static void main(String[] args) {

        int v = 5;

        ArrayList<Edge>[] graph = new ArrayList[v];

        createGraph(graph);

        // Print graph
        for (int i = 0; i < graph.length; i++) {

            System.out.print("Vertex " + i + " -> ");

            for (int j = 0; j < graph[i].size(); j++) {

                Edge e = graph[i].get(j);

                System.out.print(
                    "(" + e.dest + ", wt=" + e.wt + ") "
                );
            }

            System.out.println();
        }
    }
}