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

    }
}
