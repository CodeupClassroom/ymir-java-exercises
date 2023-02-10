package recursion;

public class Factorial {

    public static long fact(long n) {
        // hallmark #2 (a way to stop)
        if(n == 1 || n == 2) {
            return n;
        }

        // hallmark #1 (answer is in smaller terms of itself)
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
