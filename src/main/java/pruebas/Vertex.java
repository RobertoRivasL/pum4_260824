package pruebas;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Vertex class represents a vertex in a graph data structure.
 * It contains information of type V and a list of edges connecting this vertex to other vertices.
 *
 * @param <V> the type of the vertex
 * @param <E> the type of the edge
 */
public class Vertex<V, E> {

    private static final Logger LOGGER = Logger.getLogger(Vertex.class.getName());
    V info;
    List<Edge<V, E>> edges;

    public Vertex() {

    }

    public Vertex(V info) {
        this.info = info;
        edges = new ArrayList<>();
    }

    public V getInfo() {
        return info;
    }

    public void setInfo(V value) {
        info = value;
    }

    public List<Edge<V, E>> getEdges() {
        return edges;
    }

    public void addEdge(Edge<V, E> edge) {
        edges.add(edge);
    }

    public void removeEdge(Edge<V, E> edge) {
        edges.remove(edge);
    }

    public void removeEdges() {
        edges.clear();
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;

        if (this.getClass() != o.getClass())
            return false;

        Vertex<V, E> other = (Vertex<V, E>) o;

        return info.equals(other.info);
    }

    public void print() {
        logVertexInfo();
        for (Edge<V, E> e : edges) {
            e.print();
        }
    }

    private void logVertexInfo() {
        logMessage("Vertex: " + (info != null ? info : "null"));
    }

    private void logMessage(String message) {
        LOGGER.log(Level.INFO, message);
    }
}



