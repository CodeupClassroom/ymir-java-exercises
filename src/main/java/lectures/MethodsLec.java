package lectures;

import java.util.Scanner;

public class MethodsLec {
    private static String myName;

    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }

    public static String sayHello() {
        return String.format("Hello there!");
    }

    public static String sayHello(int numRepeats) {
        String str = "";
        for (int i = 0; i < numRepeats; i++) {
            str += sayHello() + "!!\n";
        }
        return str;
    }

    public static void main(String[] args) {

        // technical diff between method and function

        // create a sayHello method with a string param
            // point out the parts of method signature
            // remind students of difference in DEFINING and CALLING a method
        System.out.println(sayHello("bob"));
        System.out.println(MethodsLec.sayHello());
        System.out.println(MethodsLec.sayHello(5));

        // overload with a sayHello method with no parameters
            // introduce NO ARG term

        // overload with an int to print hello a number of times
            // show reuse by calling the no arg version

        // talk about passing by value and how to change a parameter's value OUTSIDE of the function
            // demo string changeMe function
            // 2 ways to change outside variable:
                // 1. pass it contained in an object (WILL SHOW NEXT WEEK)
                // 2. or make it global (show the static shuffle) and advise to be careful
        myName = "jimbob";
        changeMyName(myName, "bob");
        System.out.println(myName);

        myName = makeNewName("bob");

        // fun with recursion!
            // briefly go over codeup's count example
            // BRIEFLY use my fun w recursion slides to talk in more depth
                // maybe show my fibonacci examples
        Scanner input = new Scanner(System.in);
        int n = getNumberFromOneTo10(input);

        input.close();
    }

    private static int getNumberFromOneTo10(Scanner input) {
        System.out.print("Enter number from 1 to 10: ");
        int aNumber = input.nextInt();
        if(aNumber < 1 || aNumber > 10) {
            return getNumberFromOneTo10(input);
        }
        // otherwise you did it right so return it
        return aNumber;
    }

    private static String makeNewName(String newName) {
        return newName;
    }

    private static void changeMyName(String oldName, String newName) {
        myName = newName;
        System.out.println("oldName is now " + myName);
    }
}
