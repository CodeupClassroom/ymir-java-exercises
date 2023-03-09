package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return getString();
    }

    public boolean yesNo() {
        String response = getString();
        if(response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }

    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        return yesNo();
    }

    public int getInt() {
//        return scanner.nextInt();
        int userInt = 0;

        // make sure the user doesnt screw it up
        String s = getString();
        try {
            userInt = Integer.valueOf(s);
        } catch(NumberFormatException e) {
            // user messed up
            System.out.print("Invalid integer. Please re-enter: ");
            userInt = getInt();
        }

        return userInt;
    }

    public int getInt(String prompt) {
        System.out.print(prompt);
        return getInt();
    }

    public int getInt(int min, int max) {
        return getInt(min, max, "");
    }

    public int getInt(int min, int max, String prompt) {
        System.out.print(prompt);
        int anInt = getInt();
        if(anInt < min || anInt > max) {
            System.out.printf("Hey! That was not between %d and %d!!%n", min, max);
            return getInt(min, max, prompt);
        }
        return anInt;
    }

    public double getDouble() {
        double userDouble = 0;

        // make sure the user doesnt screw it up
        String s = getString();
        try {
            userDouble = Double.valueOf(s);
        } catch(NumberFormatException e) {
            // user messed up
            System.out.print("Invalid double. Please re-enter: ");
            userDouble = getDouble();
        }

        return userDouble;
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %f and %f%n", min, max);
        double aDouble = getDouble();
        if(aDouble < min || aDouble > max) {
            System.out.printf("Hey! That was not between %f and %f!!%n", min, max);
            return getDouble(min, max);
        }
        return aDouble;
    }

    public int getBinary() {
        int userInt = 0;

        // make sure the user doesnt screw it up
        String s = getString();
        try {
            userInt = Integer.valueOf(s, 2);
        } catch(NumberFormatException e) {
            // user messed up
            System.out.print("Invalid binary number. Please re-enter: ");
            userInt = getBinary();
        }

        return userInt;
    }

    public int getHex() {
        int userInt = 0;

        // make sure the user doesnt screw it up
        String s = getString();
        try {
            userInt = Integer.valueOf(s, 16);
        } catch(NumberFormatException e) {
            // user messed up
            System.out.print("Invalid hex number. Please re-enter: ");
            userInt = getHex();
        }

        return userInt;
    }
}
