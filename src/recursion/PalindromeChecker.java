package recursion;

/**
 * The class that checks for a palindrome.
 * 
 * @author meden97
 * @version 2018.01.10
 *
 */
public class PalindromeChecker {

    /**
     * Method that checks for a palindrome.
     * 
     * @param str
     *            string
     * @return boolean true/false
     */
    public static boolean isPalindrome(String str) {
        // int length = str.length();
        if (str == null) {
            return false;
        }

        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        str = str.toLowerCase();
        /***
         * if (!Character.isLetterOrDigit(str.charAt(0))) {
         * return isPalindrome(str.substring(1, length));
         * }
         * 
         * if (!Character.isLetterOrDigit(str.charAt(length - 1))) {
         * return isPalindrome(str.substring(0, length - 1));
         * }
         ***/
        str = str.replaceAll("\\W", "");

        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }

        return false;
    }
}
