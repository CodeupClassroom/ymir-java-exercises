package recursion;

public class FibonacciRecursive {
    /*
    f(n) = f(n-1) + f(n-2)
     */
    public static long fib(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(fib(50));

        System.out.println("Time in ms = " + (System.currentTimeMillis() - start));
    }
}
