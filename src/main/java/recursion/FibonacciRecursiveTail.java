package recursion;

public class FibonacciRecursiveTail {

    // swiped from https://www.geeksforgeeks.org/tail-recursion-fibonacci/
    public static long fib(int n, long a, long b) {
        if (n == 0)
            return a;
        if (n == 1)
            return b;

        return fib(n - 1, b, a + b);
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(fib(10, 0, 1));

        System.out.println("Time in ms = " + (System.currentTimeMillis() - start));
    }
}
