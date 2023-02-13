package lectures;

public class Person {
    public static int personCounter = 0;

    private String firstName;
    private String middleName;
    private String lastName;

    public Person() {
        this("", "", "");
        System.out.println("no arg constructor called");
    }

    public Person(String firstName, String middleName, String lastName) {
        System.out.println("3 arg constructor called");

        personCounter++;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;

    }

    public Person(String firstName) {
        this(firstName, "", "");
        System.out.println("1 arg constructor called");

    }

    public String sayHello() {
        return String.format("Hello from %s %s! Person counter is %d", firstName, lastName, personCounter);
    }


    // accessors


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
