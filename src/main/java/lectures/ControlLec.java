package lectures;

import java.util.Scanner;

public class ControlLec {
    public static void main(String[] args) {

        int age = -1;
//        String name = null;
//        if(name == null) {
//            System.out.println("Invalid name");
//        } else {
//            System.out.println("Name is ok");
//        }
        Scanner input = new Scanner("bobbobbobx");

        String myName = "bob";
        String otherName = input.next();

//        System.out.println(myName == otherName);
//
//        otherName = myName;
//        System.out.println(myName == otherName);

//        System.out.println(myName.equals(otherName));
        if(otherName.length() > 10) {
            System.out.println("long name");
        } else if(otherName.length() < 2) {
            System.out.println("wow!");
        } else {
            System.out.println("somewhat normal name");
        }

        String msg = switch(otherName.length()) {
            case 10, 11 -> "long name";
            case 2 -> "wow";
            default -> "somewhat normal name";
        };

//        switch (otherName.length()) {
//            case 10, 11 -> msg = "long name";
//            case 2 -> {
//                msg = "wow!";
//            }
//            default -> msg = "somewhat normal name";
//        }
        System.out.println(msg);

        input.close();
        input = new Scanner(System.in);

        String choice = "";
        boolean done = false;

        // ask user for a choice until the choose "quit"
        do {
            // prompt the user to make a choice
            System.out.print("Make a choice: ");

            // get the choice via scanner
            choice = input.nextLine();

            System.out.println("you entered " + choice);

            // determine if we are done
            if(choice.equals("quit")) {
//                done = true;
                break;
            }

        } while(true);

        for (int i = 0; i < choice.length(); i++) {
            System.out.println(choice.charAt(i));
        }

        input.close();

    }
}
