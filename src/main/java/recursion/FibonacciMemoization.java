package recursion;

public class FibonacciMemoization {
    private static final int MAX_FIB_NUMBER = 50000;

    private static final long [] memoTable = new long[MAX_FIB_NUMBER];
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

        // if we have already calculated fib(n) then just return it
        if(memoTable[n] != 0) {
            return memoTable[n];
        }

        long fibN = fib(n - 1) + fib(n - 2);
        // save fib n to the memoTable for later reuse
        memoTable[n] = fibN;

        return fibN;
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(memoTable));

        long start = System.currentTimeMillis();
        System.out.println(fib(12000));

        System.out.println("Time in ms = " + (System.currentTimeMillis() - start));
    }
}
