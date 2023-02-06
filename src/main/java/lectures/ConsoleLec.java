package lectures;

import java.util.Scanner;

public class ConsoleLec {
    public static void main(String[] args) {
        int a = 5;
        String b = "hello";
        double c = 12.57;

        System.out.printf("%d %s %.1f\n", a, b, c);

        Scanner scanner = new Scanner();
    }
}

/*
printf
    show %s %d %f %n or \n, %t
    show %5.1f for rounding ON OUTPUT
    show """

scanner
    show import
    explain new
    explain difference between Class and object

    show next()
        explain token
        show multi-world input using next()

    call next() one too many times

    show hasNext()

    show nextLine()

    show nextInt()
        and then call next() after nextInt()
        how to fix? call nextLine() when done with nextInt

 */