/**
 * 
 */
package recursion;

/**
 * Test class for the fibonacci generator.
 * 
 * @author meden97
 * @version 2018.01.10
 *
 */
public class FibonacciGeneratorTest extends student.TestCase {

    /**
     * Set up method for the test case. Instantiates
     * a Fibonacci generator object.
     */
    private FibonacciGenerator fibGen;
    
    /**
     * Sets up the test method.
     */
    public void setUp() {
        fibGen = new FibonacciGenerator();
    }


    /**
     * Tests the fibonacci sequence method.
     */
    public void testFib() {
        assertEquals(0, FibonacciGenerator.fib(0));
        assertEquals(1, FibonacciGenerator.fib(1));
        assertEquals(2, FibonacciGenerator.fib(3));
        assertEquals(34, fibGen.fib(9));
    }
}
