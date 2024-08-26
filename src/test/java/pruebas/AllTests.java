package pruebas;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


/**
 * The AllTests class represents a test suite that runs multiple test classes together.
 * It is annotated with @RunWith(Suite.class) to indicate that it is a test suite.
 * It includes the AppTest, EdgeTest, and VertexTest classes using the @SuiteClasses annotation.
 * <p>
 * Use this class to run all the test cases for the entire application.
 */
@RunWith(Suite.class)
@SuiteClasses({AppTest.class, EdgeTest.class, VertexTest.class})
public class AllTests {

}
