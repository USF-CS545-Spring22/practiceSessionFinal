package solution.graph;

/** Edge class represents a link in the linked list of edges for a vertex.
 *  Each Edge stores the id of the "neighbor" (the vertex where this edge is going =
 *  "destination" vertex), and the reference to the next Edge.
 */
class Edge {
    private int neighbor; // id of the neighbor ("destination" vertex of this edge)
    private Edge next; // reference to the next "edge" in the linked list

    public Edge(int neighbor) {
        this.neighbor = neighbor;
        this.next = null;
    }

    public Edge(int neighbor, Edge next) {
        this.neighbor = neighbor;
        this.next = next;
    }

    public int getNeighbor() {
        return neighbor;
    }

    public Edge getNext() {
        return next;
    }

    public void setNeighbor(int neighbor) {
        this.neighbor = neighbor;
    }

    public void setNext(Edge next) {
        this.next = next;
    }
}