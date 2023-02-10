package recursion;

public class FibonacciRecursiveHead {

    public static long fib(int n) {
        if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }

        // do recursive calls first
        long f1 = fib(n - 1);
        long f2 = fib(n - 2);

        // then do the work (adding)
        return f1 + f2;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(fib(10));

        System.out.println("Time in ms = " + (System.currentTimeMillis() - start));
    }
}
