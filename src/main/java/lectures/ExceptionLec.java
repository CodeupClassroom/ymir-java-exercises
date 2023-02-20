package lectures;

import docrob.util.Input;

public class ExceptionLec {

    public static void main(String[] args) {

        // throw an exception
            // no code executes until the exception is handled
            // show code underneath does not execute

        // why deliberately throw an exception?
            // to indicate that something abnormal or wrong happened
            // AND potentially respond to it in an appropriate way

        // how to respond (handle) in an appropriate way?
            // show catch
                // can use above exception to catch it as soon as you throw it

            // show finally

        // use ArithmeticException as an example (div by 0)

        // use the ArrayIndexOutOfBounds example with multiple catches
            // most specific wins

            // SCOPE: declare a variable in the try block and try to use it anywhere else

        // Checked exceptions
            // use indentation preference example
            // show the CHOICE of throws or try/catch
            // when to throw or handle

        // Unchecked exceptions

        // Custom exceptions



//        int [] array = new int[10];
//
//        try {
//            System.out.println(array[11]);
//
//        } catch(ArrayIndexOutOfBoundsException e) {
//            // code that handles this particular exception
//            System.out.println("Not a valid index!");
//
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//
//        } finally {
//            // close files and db connection and release tons of memory back to program
//            System.out.println("finally called");
//        }
//        int a = 0;
//        try {
//            throw new FileNotFoundException("docrob's exception!");
//        } catch (RuntimeException | FileNotFoundException e) {
//            a = 5;
//            System.out.println("an exception was caught");
//        }
//        // a cannot be seen here
//        System.out.println(a);
        Input input = new Input();

        while(true) {
            try {
                System.out.println("Enter a person's name: ");
                String personName = input.getString();
                Person p = new Person(personName);

                // if we get here: what do we know?
                System.out.println("You made: " + p.getFirstName());
                System.out.println("Done");
                return;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

//        Person [] people = new PersonBuilder().setFirstName("Bob").setFirstName("Sue").setFirstName("Steve").build();

    }
}
