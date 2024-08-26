package pruebas;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The Graph class represents a graph data structure that consists of vertices and edges.
 * Each vertex contains information of type V, and each edge contains information of type E.
 * The graph can be directed or undirected, and it is implemented using an adjacency list representation.
 *
 * @param <V> the type of the vertex
 * @param <E> the type of the edge
 */
public class Graph<V, E> {
    private static final Logger LOGGER = Logger.getLogger(Graph.class.getName());
    String name;
    List<Vertex<V, E>> nodes;

    public Graph() {
        this("vacío");
    }

    public Graph(String name) {
        this.name = name;
        nodes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vertex<V, E>> getNodes() {
        return nodes;
    }

    public void setNodes(List<Vertex<V, E>> nodes) {
        this.nodes = nodes;
    }

    public void addVertex(Vertex<V, E> vertex) {
        nodes.add(vertex);
    }

    public void addEdge(Vertex<V, E> source, Vertex<V, E> target, E info) {
        Edge<V, E> edge = new Edge<>(info, target);

        source.addEdge(edge);
    }

    public void removeEdge(Vertex<V, E> source, Vertex<V, E> target, E info) {
        List<Edge<V, E>> edges = source.getEdges();

        Edge<V, E> edge = null;

        for (Edge<V, E> e : edges) {
            if (e.getInfo().equals(info) && e.getTarget().equals(target)) {
                edge = e;
                break;
            }
        }

        if (edge != null) {
            source.removeEdge(edge);
        }

    }

    public void print() {
        logGraphHeader();

        for (Vertex<V, E> v : nodes) {
            v.print();
        }
    }

    private void logGraphHeader() {
        LOGGER.log(Level.INFO, "--- Graph: ");
        LOGGER.log(Level.INFO, name);
        LOGGER.log(Level.INFO, " ---");
    }
}


