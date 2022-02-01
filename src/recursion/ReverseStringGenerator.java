/**
 * 
 */
package recursion;

/**
 * The class for the fibonacci generator.
 * 
 * @author meden97
 * @version 2018.01.10
 *
 */
public class ReverseStringGenerator {

    /**
     * Method to generate the reverse of a string.
     * 
     * @param str
     *            string
     * @return String string value
     */
    public static String reverse(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
