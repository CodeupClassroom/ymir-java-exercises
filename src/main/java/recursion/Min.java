package recursion;

public class Min {
    /*
    recursive definition
    hallmark 1: min(a, n) = smaller of a[n-1] and min(a, n-1)
    hallmark 2: min(a, 1) = a[0]
     */
    public static int min(int [] a, int n) {
        if(n == 1) {
            return a[0];
        }

        return Math.min(a[n - 1], min(a, n - 1));
    }

    public static void main(String[] args) {
        int vals [] = { 12, 1234, 45, 67, 1 };
        System.out.println(min(vals, vals.length));
    }
}
