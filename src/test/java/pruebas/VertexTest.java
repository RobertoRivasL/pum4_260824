package pruebas;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

/**
 * The VertexTest class is a collection of JUnit test methods that test the functionality of the Vertex class.
 * It tests various methods such as getInfo(), setInfo(), getEdges(), addEdge(), removeEdge(), and removeEdges().
 * The tests are categorized using the GettersAndSettersTests category.
 * //
 * The VertexTest class does not contain example code, author, version, or since tags.
 * //
 * The VertexTest class assumes that the Vertex class and the Edge class are already implemented and functional.
 * //
 * To run the tests in this class, use a testing framework such as JUnit and execute the test methods.
 */
public class VertexTest {

    private static final Character VERTEX_A = 'A';
    private static final Character VERTEX_B = 'B';
    private static final Character VERTEX_C = 'C';
    private static final int EDGE_WEIGHT_1 = 1;
    private static final int EDGE_WEIGHT_2 = 2;

    @Category(GettersAndSettersTests.class)
    @Test
    public void testGetInfo() {
        Vertex<Character, Integer> vertex = new Vertex<>(VERTEX_A);
        assertEquals(VERTEX_A, vertex.getInfo());
    }

    @Category(GettersAndSettersTests.class)
    @Test
    public void testSetInfo() {
        Vertex<Character, Integer> vertex = new Vertex<>();
        vertex.setInfo(VERTEX_A);
        assertEquals(VERTEX_A, vertex.getInfo());
    }

    @Category(GettersAndSettersTests.class)
    @Test
    public void testGetEdges() {
        Vertex<Character, Integer> vertex = createVertexWithSampleEdges();
        assertEquals(2, vertex.getEdges().size());
        assertEquals(VERTEX_B, vertex.getEdges().get(0).getTarget().getInfo());
    }

    @Test
    public void testAddEdge() {
        Vertex<Character, Integer> vertexA = new Vertex<>(VERTEX_A);
        Vertex<Character, Integer> vertexB = new Vertex<>(VERTEX_B);
        Edge<Character, Integer> newEdge = new Edge<>(EDGE_WEIGHT_1, vertexB);

        vertexA.addEdge(newEdge);

        assertEquals(1, vertexA.getEdges().size());
        assertEquals(VERTEX_B, vertexA.getEdges().get(0).getTarget().getInfo());
    }

    @Test
    public void testRemoveEdge() {
        Vertex<Character, Integer> vertex = createVertexWithSampleEdges();
        Edge<Character, Integer> edgeToB = vertex.getEdges().get(0);
        vertex.removeEdge(edgeToB);
        assertEquals(1, vertex.getEdges().size());
        assertEquals(VERTEX_C, vertex.getEdges().get(0).getTarget().getInfo());
    }

    @Test
    public void testRemoveEdges() {
        Vertex<Character, Integer> vertex = createVertexWithSampleEdges();
        vertex.removeEdges();
        assertEquals(0, vertex.getEdges().size());
    }

    private Vertex<Character, Integer> createVertexWithSampleEdges() {
        Vertex<Character, Integer> vertexA = new Vertex<>(VERTEX_A);
        Vertex<Character, Integer> vertexB = new Vertex<>(VERTEX_B);
        Vertex<Character, Integer> vertexC = new Vertex<>(VERTEX_C);
        vertexA.addEdge(new Edge<>(EDGE_WEIGHT_1, vertexB));
        vertexA.addEdge(new Edge<>(EDGE_WEIGHT_2, vertexC));
        return vertexA;
    }
}