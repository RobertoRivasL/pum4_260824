package pruebas;

/**
 * The App class is the main class of the program that demonstrates the usage of the Graph class to create a graph,
 * add vertices and edges to the graph, remove edges from the graph, and print the graph.
 * <p>
 * The main method creates a Graph object named "mapa" and initializes a set of Vertex objects named a, b, c, d, and e.
 * It adds these vertices to the graph using the addVertex() method of the Graph class.
 * It then adds edges between various vertices using the addEdge() method of the Graph class.
 * It also demonstrates the removal of an edge using the removeEdge() method of the Graph class.
 * Finally, it prints the graph using the imprime() method of the Graph class.
 * <p>
 * Note that the main method does not showcase any return values or exception handling. It is solely meant to demonstrate
 * the basic usage of the Graph class.
 */
public class App {
    public static void main(String[] args) {

        Graph<Character, Integer> mapa = new Graph<>("Guía Roji");

        /* Crear vértices */
        Vertex<Character, Integer> a = new Vertex<>('A');
        Vertex<Character, Integer> b = new Vertex<>('B');
        Vertex<Character, Integer> c = new Vertex<>('C');
        Vertex<Character, Integer> d = new Vertex<>('D');
        Vertex<Character, Integer> e = new Vertex<>('E');

        /* Adicionar vértices al grafo */
        mapa.addVertex(a);
        mapa.addVertex(b);
        mapa.addVertex(c);
        mapa.addVertex(d);
        mapa.addVertex(e);

        /* Adicionar aristas */
        mapa.addEdge(a, b, 30);
        mapa.addEdge(a, e, 100);
        mapa.addEdge(b, a, 50);
        mapa.addEdge(b, d, 75);
        mapa.addEdge(c, d, 20);
        mapa.addEdge(d, b, 60);
        mapa.addEdge(e, c, 15);

        /* Eliminar una arista */
        mapa.removeEdge(a, b, 30);

        /* Mostrar el grafo */
        mapa.print();
    }
}
