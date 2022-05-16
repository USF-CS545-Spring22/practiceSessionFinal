package graph;

public class Graph {
    private int[][] matrix; // adjacency matrix
    private Edge[] graph; // adjacency list

    public Graph(int[][] matrix) {
        this.matrix = matrix;
        this.graph = new Edge[matrix.length];
    }

    // Print nodes using BFS traversal. The graph is represented using a matrix.
    public void printBFS(int sourceVertex) {
        boolean[] visited = new boolean[matrix.length];
        visited[sourceVertex] = true;
        System.out.println(sourceVertex);

        Queue queue = new ArrayQueue();
        queue.enqueue(sourceVertex);
        // FILL IN CODE


    }

    // Print nodes of the graph using BFS. The graph is represented using an adjacency list.
    public void printBFSAdjacencyList(int sourceVertex) {
        boolean[] visited = new boolean[graph.length];
        visited[sourceVertex] = true;
        System.out.println(sourceVertex);

        Queue queue = new ArrayQueue();
        queue.enqueue(sourceVertex);

        // FILL IN CODE

    }

    public void addEdge(int vertexId, Edge edge) {
        Edge head = graph[vertexId]; // head of the linked list for this  node
        graph[vertexId] = edge; // insert in front
        if (head != null) {
            edge.setNext(head);
        }
    }


    public static void main(String[] args) {

        int[][] matrix = new int[5][5];
        // Edges from 0 to 1 and 2
        matrix[0][1] = 1;
        matrix[0][2] = 1;

        // Edges from 1 to 0, 2, 3
        matrix[1][0] = 1;
        matrix[1][2] = 1;
        matrix[1][3] = 1;

        // Edges from 3 to 0, 2 and 4
        matrix[3][0] = 1;
        matrix[3][2] = 1;
        matrix[3][4] = 1;

        //Edge from 4 to 2
        matrix[4][2] = 1;

        // This is a graph you can test your code on:
        Graph g = new Graph(matrix);
        g.printBFS(0);
        // Should print 0, 1, 2, 3, 4

        // Let's also create an adjacency list for this graph
        // Edges from 0 to 1 and 2
        g.addEdge(0, new Edge(1));
        g.addEdge(0, new Edge(2));

        // Edges from 1 to 0, 2, 3
        g.addEdge(1, new Edge(0));
        g.addEdge(1, new Edge(2));
        g.addEdge(1, new Edge(3));

        // Edges from 3 to 0, 2 and 4
        g.addEdge(3, new Edge(0));
        g.addEdge(3, new Edge(2));
        g.addEdge(3, new Edge(4));

        //Edge from 4 to 2
        g.addEdge(4, new Edge(2));
        g.printBFSAdjacencyList(0);
        // Should print 0, 1, 2, 3, 4

    }
}