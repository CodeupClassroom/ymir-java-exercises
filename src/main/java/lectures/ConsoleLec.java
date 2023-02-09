package lectures;

import java.util.Scanner;

public class ConsoleLec {
    public static void main(String[] args) {
        int a = -17;
//        String b = "hello";
        String aName = "Bob";
        double c = 12.57;

//        System.out.println("Howdy " + myName + " age: " + a + " makes " + c + " bucks per hr.");
//        System.out.printf("Howdy %s age: %+05d makes %7.1f bucks per hr%n", myName, a, c);

        Scanner input = new Scanner("42");
//        input.useDelimiter("\n");

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Your age is " + age);
//
//        // get the newline char out of the buffer
//        // this is stupid
//        input.nextLine();
//
//        System.out.print("Enter your name: ");
////        aName = input.next();
//        aName = input.nextLine();
//        System.out.println("Your name is " + aName);
//
////        aName = input.next();
////        System.out.println("Your OTHER name is " + aName);

//        String s = input.nextLine();
//
//        double w = Double.parseDouble(s);
//        s = input.nextLine();
//
//        double h = Double.parseDouble(s);

        input.close();
        input = new Scanner(System.in);

        System.out.print("Enter room length (double): ");
        double length = input.nextDouble();
        System.out.print("Enter room width (double): ");
        double width = input.nextDouble();
        System.out.print("Enter room height (double): ");
        double height = input.nextDouble();

        double area = length * width;
        double volume = area * height;
        double perimeter = (2 * length) + (2 * width);
        System.out.printf("Area of room: %f\n" +
                        "Perimeter of room: %f\n" +
                        "Volume of room: %f\n",
                area, perimeter, volume);

        input.close();
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

    show nextLine()

    show nextInt() to get the user's age
        and then call nextLine() to get the user's name
        how to fix? call nextLine() when done with nextInt

https://www.freecodecamp.org/news/java-scanner-nextline-call-gets-skipped-solved/#:~:text=nextInt()%20method%20only%20consumes,the%20user%2C%20and%20returns%20immediately.
 */