package lectures;

import util.Input;
import playtime.Fighter;

import java.util.Arrays;

public class ArrayLec {
    public static void main(String[] args) {
        // describe what arrays are (simple diagram on board
        int [] ages = new int[10];
        ages[0] = 42;
        ages[5] = 75;

        Input input = new Input();
        System.out.print("How many elements? ");
        int arrayLength = input.getInt();
        ages = new int[arrayLength];

//        ages[11] = 25;
        System.out.println(Arrays.toString(ages));


        // declare an array of ints
        // fixed length MUST KNOW AT THE TIME THE ARRAY DECLARATION EXECUTES

        // initial values of array elements
        // show how to print an array Arrays.toString()

        // accessing elements via bracket notation and indexes

        // array initializers if you know some/all values when writing the code (e.g., days of the week)
        String [] daysOfWeek = {"10", "11", "2", "Wed", "thu", "Fri", "Sat"};
        System.out.println(Arrays.toString(daysOfWeek));

        // LOOPS and ARRAYS
//        for (int i = 0; i < daysOfWeek.length; i++) {
//            System.out.println(daysOfWeek[i]);
//            daysOfWeek[i] = "blah";
//        }
//        System.out.println(Arrays.toString(daysOfWeek));

        // fori

        // foreach
        for (String day: daysOfWeek) {
            System.out.println(day);
//            day = "blah";
        }

        System.out.println(Arrays.toString(daysOfWeek));

        // useful array static methods via the Arrays utility class

        // fill
//        Arrays.fill(daysOfWeek, "blah");

        // equals
//        daysOfWeek = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        String [] otherArray = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        System.out.println(daysOfWeek == otherArray);
        System.out.println(Arrays.equals(daysOfWeek, otherArray));

        // copyOf
        String [] newArray = Arrays.copyOf(daysOfWeek, 10);
        System.out.println(Arrays.toString(newArray));

//        daysOfWeek = Arrays.copyOf(daysOfWeek, 15);
//        System.out.println(Arrays.toString(daysOfWeek));

        // sort
        Arrays.sort(daysOfWeek);
        System.out.println(Arrays.toString(daysOfWeek));

        // show an array of Person objects
        Fighter [] arena = new Fighter[5];
        System.out.println(Arrays.toString(arena));

        arena[0] = new Fighter("Knull");
        System.out.println(Arrays.toString(arena));

        System.out.println(arena[0]);
    }
}
