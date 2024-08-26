package pruebas;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Edge class represents an edge between two vertices in a graph.
 * It contains information about the edge and the target vertex.
 *
 * @param <V> the type of the vertex
 * @param <E> the type of the edge
 */
public class Edge<V, E> {

    private static final Logger logger = Logger.getLogger(Edge.class.getName());
    private E info;
    private Vertex<V, E> target;

    public Edge() {
        // Constructor vacío.
    }

    public Edge(E info, Vertex<V, E> target) {
        this.info = info;
        this.target = target;
    }

    public E getInfo() {
        return info;
    }

    public void setInfo(E info) {
        this.info = info;
    }

    public Vertex<V, E> getTarget() {
        return target;
    }

    public void setTarget(Vertex<V, E> target) {
        this.target = target;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Edge<?, ?> other = (Edge<?, ?>) obj;
        return info.equals(other.info) && target.equals(other.target);
    }

    private void logInfo(String message) {
        logger.log(Level.INFO, message);
    }

    public void print() {
        logInfo(String.valueOf(info));
        logInfo("---> ");
        logInfo(String.valueOf(target.getInfo()));
    }
}