package pruebas;

import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;

/**
 * The EdgeTest class is a JUnit test class that tests the functionality of the Edge class.
 * <p>
 * It includes test methods for the following scenarios:
 * - Testing the correct edge information is returned by getInfo() method
 * - Testing the correct edge information is set and returned by setInfo() method
 * - Testing the correct target vertex is returned by getTarget() method
 * - Testing the correct target vertex is set and returned by setTarget() method
 * <p>
 * The EdgeTest class uses Mockito to mock the Vertex class, and it is annotated
 * with @RunWith(MockitoJUnitRunner.class) to use the Mockito runner.
 * <p>
 * This class does not contain any example code, author, version, or since tags.
 */
@RunWith(MockitoJUnitRunner.class)
public class EdgeTest {

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private Vertex<Character, Integer> target;

    @Category(GettersAndSettersTests.class)
    @Test
    public final void shouldReturnCorrectEdgeInfo() {
        Edge<Character, Integer> edge = createEdgeWithInfo(30);
        assertEquals((Integer) 30, edge.getInfo());
    }

    @Category(GettersAndSettersTests.class)
    @Test
    public final void shouldSetAndGetEdgeInfo() {
        Edge<Character, Integer> edge = new Edge<>();
        edge.setInfo(50);
        assertEquals((Integer) 50, edge.getInfo());
    }

    @Category(GettersAndSettersTests.class)
    @Test
    public final void shouldReturnCorrectTarget() {
        Edge<Character, Integer> edge = createEdgeWithInfo(30);
        assertEquals(target, edge.getTarget());
    }

    @Category(GettersAndSettersTests.class)
    @Test
    public final void shouldSetAndGetTarget() {
        Edge<Character, Integer> edge = new Edge<>();
        Mockito.when(target.getInfo()).thenReturn('B');
        edge.setTarget(target);
        assertEquals((Character) 'B', edge.getTarget().getInfo());
    }

    private Edge<Character, Integer> createEdgeWithInfo(int info) {
        return new Edge<>(info, target);
    }
}