package recursion;

public class FibonacciIterative {
    /*
    f(n) = f(n-1) + f(n-2)
     */
    public static long fib(int n) {
        long fibN = 0;
        long nMinus1 = 1;
        long nMinus2 = 0;

        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        for(int i = 2; i <= n; i++) {
            fibN = nMinus1 + nMinus2;
            nMinus2 = nMinus1;
            nMinus1 = fibN;
        }
        return fibN;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(fib(50000));

        System.out.println("Time in ms = " + (System.currentTimeMillis() - start));
    }
}
