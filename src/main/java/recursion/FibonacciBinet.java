package recursion;

public class FibonacciBinet {
    /*
    reference: https://mathworld.wolfram.com/BinetsFibonacciNumberFormula.html
     */
    public static double fib(int n) {
        double fibN = Math.pow((1 + Math.sqrt(5)) / 2, n);
        fibN -= Math.pow((1 - Math.sqrt(5)) / 2, n);
        fibN /= Math.sqrt(5);
        return fibN;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println(fib(10));

        System.out.println("Time in ms = " + (System.currentTimeMillis() - start));
    }
}
