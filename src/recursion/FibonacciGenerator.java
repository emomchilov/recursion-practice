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
public class FibonacciGenerator {

    /**
     * precondition: n is non-negative
     * 
     * @param n
     *            size
     * @return int fibonacci sequence
     */
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
