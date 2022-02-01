package recursion;

/**
 * Tests the palindrome checker class.
 * 
 * @author meden97
 * @version 2018.01.10
 *
 */
public class PalindromeCheckerTest extends student.TestCase {

    private PalindromeChecker check;
    
    /**
     * Sets up the test class. Instantiates the
     * reverse string object.
     */
    public void setUp() {
        check = new PalindromeChecker();
    }


    /**
     * Tests if a palindrome returns true.
     */
    public void testPalindromeCheckerTrue() {
        assertTrue(check.isPalindrome("racecar"));
    }


    /**
     * Tests if a palindrome returns true with one character
     */
    public void testPalindromeCheckerTrueOneChar() {
        assertTrue(PalindromeChecker.isPalindrome("r"));
    }


    /**
     * Tests if a palindrome returns true with a capital.
     */
    public void testPalindromeCheckerTrueCaps() {
        assertTrue(PalindromeChecker.isPalindrome("Hannah"));
    }


    /**
     * Tests if a palindrome returns false.
     */
    public void testPalindromeCheckerFalse() {
        assertFalse(PalindromeChecker.isPalindrome("bunny"));
    }


    /**
     * Tests a sentence with punctuation.
     */
    public void testPalindromeCheckerSentence() {
        assertTrue(PalindromeChecker.isPalindrome("Go hang a "
            + "salami, I'm a lasagna hog."));
    }


    /**
     * Tests a sentence with punctuation.
     */
    public void testPalindromeCheckerSentence1() {
        assertTrue(PalindromeChecker.isPalindrome("A Toyota! Race"
            + " fast, safe car. A Toyota."));
    }


    /**
     * Tests a sentence with punctuation.
     */
    public void testPalindromeCheckerSentence3() {
        assertTrue(PalindromeChecker.isPalindrome(
            "\"Tie Mandie,\" I'd name it."));
    }


    /**
     * Tests a sentence with punctuation.
     */
    public void testPalindromeCheckerSentence4() {
        assertTrue(PalindromeChecker.isPalindrome("Wonton? Not now."));
    }


    /**
     * Tests a sentence with numbers.
     */
    public void testPalindromeCheckerSentence5() {
        assertTrue(PalindromeChecker.isPalindrome("1.2.1"));
    }
    
    /**
     * Tests a sentence with null.
     */
    public void testPalindromeCheckerNull() {
        String str = null;
        assertFalse(PalindromeChecker.isPalindrome(str));
    }

}
