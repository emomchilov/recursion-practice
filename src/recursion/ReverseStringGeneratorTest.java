/**
 * 
 */
package recursion;

/**
 * Test class for the String reverse generator.
 * 
 * @author meden97
 * @version 2018.01.10
 *
 */
public class ReverseStringGeneratorTest extends student.TestCase {

    private ReverseStringGenerator gen;


    /**
     * Sets up the test class. Instantiates the
     * reverse string object.
     */
    public void setUp() {
        gen = new ReverseStringGenerator();
    }


    /**
     * Tests the reverse string method on a string of 2 characters.
     */
    public void testReverseString() {
        assertEquals("ba", gen.reverse("ab"));
    }


    /**
     * Tests the reverse string method on a string of more than 2
     * characters.
     */
    public void testReverseString1() {
        assertEquals("string", ReverseStringGenerator.reverse("gnirts"));
    }


    /**
     * Tests the reverse string method on a string of 1 character.
     */
    public void testReverseString2() {
        assertEquals("g", ReverseStringGenerator.reverse("g"));
    }


    /**
     * Tests the reverse string method on a string that is null.
     */
    public void testReverseStringNull() {
        String str = null;
        assertNull(str, ReverseStringGenerator.reverse(str));
    }

}
