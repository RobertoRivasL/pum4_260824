package pruebas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class AppTest {

    @Test
    public void testNumberOfNodes() {
        Graph<Character, Integer> mapa = new Graph<>("Guía Roji");

        /* Crear vértices */
        Vertex<Character, Integer> vertexA = new Vertex<>('A');
        Vertex<Character, Integer> vertexB = new Vertex<>('B');
        Vertex<Character, Integer> vertexC = new Vertex<>('C');
        Vertex<Character, Integer> vertexD = new Vertex<>('D');
        Vertex<Character, Integer> vertexE = new Vertex<>('E');

        /* Adicionar vértices al grafo */
        mapa.addVertex(vertexA);
        mapa.addVertex(vertexB);
        mapa.addVertex(vertexC);
        mapa.addVertex(vertexD);
        mapa.addVertex(vertexE);

        assertEquals("Deben ser 5 nodos", 5, mapa.getNodes().size());
    }

    @Test
    public void testGraphName() {
        Graph<Character, Integer> mapa = new Graph<>("Guía Roji");
        assertEquals("El nombre debe ser Guía Roji", "Guía Roji", mapa.getName());
    }

}