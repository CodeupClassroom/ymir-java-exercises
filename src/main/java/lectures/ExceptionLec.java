package lectures;

public class ExceptionLec {

    public static void main(String[] args) {

        // throw an exception
            // no code executes until the exception is handled
            // show code underneath does not execute

//        throw new RuntimeException();
//        System.out.println("does this print?");

        // why deliberately throw an exception?
            // to indicate that something abnormal or wrong happened
            // AND potentially respond to it in an appropriate way

        try {
            throw new RuntimeException("boo");
//            System.out.println("will this code print?");
        } catch(RuntimeException e) {
            System.out.println("an exception occurred: ");
        } finally {
            System.out.println("finally code always executes");
        }

        System.out.println("program is still going");

        // how to respond (handle) in an appropriate way?
            // show catch
                // can use above exception to catch it as soon as you throw it

            // show finally

        // use ArithmeticException as an example (div by 0)
        try {
            int x = 5 / 0;
        } catch(ArithmeticException e) {
            System.out.println("Don't divide by zero!");
        }
        int[] nums = null;
        try {
            nums = new int[10];
            nums[11] = 4;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("does the ArrayIndexOutOfBoundsException handler print?");
            System.out.println(nums);
        } catch(Exception e) {
            System.out.println("does the exception handler print?");
        }
        // use the ArrayIndexOutOfBounds example with multiple catches
            // most specific wins

            // SCOPE: declare a variable in the try block and try to use it anywhere else

        // Checked exceptions
            // use indentation preference example
            // show the CHOICE of throws or try/catch
            // when to throw or handle

//        throw new Exception("checked exception");

        // Unchecked exceptions

        // throws
        try {
            String userInput = getUserInput();
        } catch (Exception e) {
            System.out.println("hey man chill out");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        // Custom exceptions
        Person p = new Person("bob");
    }

    private static String getUserInput() throws Exception {
        throw new Exception("the user hates us!");
    }
}
