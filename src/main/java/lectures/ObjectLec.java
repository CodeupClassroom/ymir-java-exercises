package lectures;

public class ObjectLec {

    public static void main(String[] args) {
        // copy Person class from book
        // use its main to make a few Person objects
        // point out differences in the object property (instance var) values
        Person alex = new Person("Alex", "G", "S");
//        Person.personCounter++;
//        alex.setFirstName("Alex");
//        alex.setLastName("S");
//        alex.setMiddleName("G");

        System.out.println(alex.getFirstName());
        System.out.println(alex.sayHello());
        System.out.println(alex.getMiddleName());

        Person sue = new Person("Sue");
//        Person.personCounter++;
//        sue.setFirstName("Sue");
        System.out.println(sue.sayHello());


        // change instance vars to private and talk about getters/setters
        // show intellij generate getters and setters for you
        // ok to directly access fields INSIDE its own class
        // not ok from other classes

        // add a static field like personCounter
        // talk about using static fields in object functions, but not vice versa
        // show accessing static field in object function as well as main()

        // copy student class
        // show 1 arg and 2 arg constructors
        // show a 0 arg constructor and talk about defaults and re-use
        // make sure the this keyword is pointed out by accidentally setting the parameter
            // a little confusing for instance vars and params to have the same name
            // but is ok if the identifier is a good one

        // show intellij make constructors for you



    }
}
